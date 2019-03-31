package Utils;

import java.util.regex.Pattern;

/**
 * PORT OF: https://github.com/parshap/node-sanitize-filename/blob/master/index.js
 *
 * Replaces characters in strings that are illegal/unsafe for filenames.
 * Unsafe characters are either removed or replaced by a substitute set
 * in the optional `options` object.
 *
 * Illegal Characters on Various Operating Systems
 * / ? < > \ : * | "
 * https://kb.acronis.com/content/39790
 *
 * Unicode Control codes
 * C0 0x00-0x1f & C1 (0x80-0x9f)
 * http://en.wikipedia.org/wiki/C0_and_C1_control_codes
 *
 * Reserved filenames on Unix-based systems (".", "..")
 * Reserved filenames in Windows ("CON", "PRN", "AUX", "NUL", "COM1",
 * "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9",
 * "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", and
 * "LPT9") case-insesitively and with or without filename extensions.
 */

public class StringSanitize {
    private static Pattern illegalRe = Pattern.compile("[\\/\\?<>\\\\:\\*\\|\":]");
    private static Pattern controlRe = Pattern.compile("[\\x00-\\x1f\\x80-\\x9f]");
    private static Pattern reservedRe = Pattern.compile("^\\.+$");
    private static Pattern windowsReservedRe = Pattern.compile("(con|prn|aux|nul|com[0-9]|lpt[0-9])(\\..*)?",
            Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
    private static Pattern windowsTrailingRe = Pattern.compile("[\\s.]+$");

    public static String SanitizeString(String stringToSanitize){
        String safeString = stringToSanitize
                .replaceAll(illegalRe.pattern(), "")
                .replaceAll(controlRe.pattern(), "")
                .replaceAll(reservedRe.pattern(), "")
                .replaceAll(windowsTrailingRe.pattern(), "")
                .replaceAll(windowsReservedRe.pattern(), "");

        return TruncateToMaxLength(safeString);
    }

    private static String TruncateToMaxLength(String value) {
        if (value.length() > 255) {
            return value.substring(0, 255);
        } else {
            return value;
        }
    }
}
