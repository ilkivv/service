package com.alfaservice.webcontent.entities;

import com.ibm.icu.text.Transliterator;

public class Transcriptor {

    public static final String CYRILLIC_TO_LATIN = "Cyrillic-Latin";

    public static String translitRuToEn(String string){
        Transliterator toLatinTrans = Transliterator.getInstance(CYRILLIC_TO_LATIN);
        String result = toLatinTrans.transliterate(string);
        result.toLowerCase();
        return result;
    }

}
