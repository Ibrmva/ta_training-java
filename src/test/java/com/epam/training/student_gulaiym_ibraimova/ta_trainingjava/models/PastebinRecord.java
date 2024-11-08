package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.models;


import java.util.Objects;

import static com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util.StringUtils.containsSubstring;

public class PastebinRecord {

    private String title;
    private String body;
    private String expiration;
    private String syntax;

    public PastebinRecord(String title, String body, String expiration) {
        this.title = title;
        this.body = body;
        this.expiration = expiration;
    }

    public PastebinRecord(String title, String body, String expiration, String syntax) {
        this.title = title;
        this.body = body;
        this.expiration = expiration;
        this.syntax = syntax;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getSyntax() {
        return syntax;
    }

    public boolean hasSyntax() {
        return syntax != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PastebinRecord)) return false;
        PastebinRecord other = (PastebinRecord) o;
        if (!Objects.equals(getTitle(), other.getTitle()) ||
                !Objects.equals(getBody(), other.getBody()) ||
                !containsSubstring(getExpiration(), other.getExpiration())
        ) {
            return false;
        }
        if (hasSyntax()) {
            return Objects.equals(getSyntax(), other.getSyntax());
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pastebin " +
                "{ title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", expiration='" + expiration + '\'' +
                ", syntax='" + syntax + '\'' +
                '}';
    }
}

