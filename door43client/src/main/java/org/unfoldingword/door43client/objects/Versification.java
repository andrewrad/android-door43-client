package org.unfoldingword.door43client.objects;

/**
 * Represents a versification system.
 * This is what chunk markers are based on.
 */
public class Versification {
    public static String slug;
    public static String name;

    public Versification(String slug, String name) {
        this.slug = slug;
        this.name = name;
    }
}