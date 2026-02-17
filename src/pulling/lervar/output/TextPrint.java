/**
 * LerVar_LanguagePulling(v.pre-?.?_Beta?, v.release-?.?.?)
 * develop:
 * -with: [LerVar]
 * -for: [LerVar]
 * <p>
 * @since 2026
 * Copyright (c) 2026J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar_LanguagePulling/blob/main/LICENSE
 */

package pulling.lervar.output;

import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintLanguages;
import com.lervar.main.Type;

public interface TextPrint extends OptionPrintLanguages {
    @Override
    default String[][] optionPrintLanguages(Type t){
        return new String[][]{{}};
    }
}
