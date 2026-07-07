package me.imdanix.wgtranslator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
        '&#FF0000Uppercase hex' | '§x§f§f§0§0§0§0Uppercase hex'
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
        for (Msg msgLeft : Msg.values()) {
            String[] sectionsLeft = msgLeft.name().split("_");
            for (Msg msgRight : Msg.values()) {
                if (msgLeft == msgRight) continue;
                String[] sectionRight = msgRight.name().split("_");
                if (sectionsLeft.length > sectionRight.length) continue;

                if (isPrefix(sectionsLeft, sectionRight)) {
                    fail("'" + msgRight.name() + "' contains '" + msgLeft.name() + "'");
                }
            }
        }
    }

    private boolean isPrefix(String[] shorter, String[] longer) {
        for (int i = 0; i < shorter.length; i++) {
            if (!shorter[i].equals(longer[i])) {
                return false;
            }
        }
        return true;
    }
}
