package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models.PastebinRecord;

public class PasteBuilder {

    private static final String TESTDATA_PASTE_TITLE  = "testdata.paste.title";
    private static final String TESTDATA_PASTE_BODY = "testdata.paste.body";
    private static final String TESTDATA_PASTE_EXPIRATION = "testdata.paste.expiration";
    private static final String TESTDATA_PASTE_BASH_TITLE  = "testdata.pasteBash.title";
    private static final String TESTDATA_PASTE_BASH_BODY = "testdata.pasteBash.body";
    private static final String TESTDATA_PASTE_BASH_EXPIRATION = "testdata.pasteBash.expiration";
    private static final String TESTDATA_PASTE_BASH_SYNTAX = "testdata.pasteBash.syntax";
    public static PastebinRecord fromProperties() {
        return new PastebinRecord(
                TestDataReader.getTestData(TESTDATA_PASTE_TITLE),
                TestDataReader.getTestData(TESTDATA_PASTE_BODY),
                TestDataReader.getTestData(TESTDATA_PASTE_EXPIRATION)
        );
    }

    public static PastebinRecord fromPropertiesWithBashScript() {
        return new PastebinRecord(
                TestDataReader.getTestData(TESTDATA_PASTE_BASH_TITLE),
                TestDataReader.getTestData(TESTDATA_PASTE_BASH_BODY),
                TestDataReader.getTestData(TESTDATA_PASTE_BASH_EXPIRATION),
                TestDataReader.getTestData(TESTDATA_PASTE_BASH_SYNTAX)
        );
    }
}
