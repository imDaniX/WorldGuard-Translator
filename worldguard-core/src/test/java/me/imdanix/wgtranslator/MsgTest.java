package me.imdanix.wgtranslator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MsgTest {
    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        '&0Black' | '§0Black'
        '&aGreen' | '§aGreen'
        '&lBold' | '§lBold'
        '&rReset' | '§rReset'
        '&#abcdefMixed hex' | '§x§a§b§c§d§e§fMixed hex'
        '&#123456Dark hex' | '§x§1§2§3§4§5§6Dark hex'
        'Normal text without codes' | 'Normal text without codes'
        '&Invalid code' | '&Invalid code'
        '&' | '&'
        '' | ''
        '&&kDouble ampersand' | '&§kDouble ampersand'
        '&#FF0000Uppercase hex' | '&#FF0000Uppercase hex'
        '&#12Short hex' | '&#12Short hex'
        '&#ghijklNon hex' | '&#ghijklNon hex'
        'Text ending with &' | 'Text ending with &'
        '&#ffffff&#000000Two hex back to back' | '§x§f§f§f§f§f§f§x§0§0§0§0§0§0Two hex back to back'
        """)
    public void colorizeTest(String input, String expected) {
        assertEquals(expected, Msg.colorize(input));
    }

    @Test
    public void sectionsTest() {
        List<String> names = Arrays.stream(Msg.values()).map(Enum::name).toList();

        for (String a : names) for (String b : names) {
            if (!a.equals(b)) {
                assertFalse(
                        a.contains(b),
                        "'" + a + "' contains '" + b + "'"
                );
            }
        }
    }
}
