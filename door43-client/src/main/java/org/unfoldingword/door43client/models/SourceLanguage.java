package org.unfoldingword.door43client.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Represents a language that a resource exists in  (for the purpose of source content)
 */
public class SourceLanguage extends DatabaseObject {
    public final String slug;
    public final String name;
    public final String direction;

    /**
     *
     * @param slug the language code
     * @param name the name of the language
     * @param direction the written direction of the language
     */
    public SourceLanguage(String slug, String name, String direction) {
        this.slug = slug;
        this.name = name;
        this.direction = direction;
    }

    /**
     * Returns the object serialized to json
     * @return
     */
    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("slug", slug);
        json.put("name", name);
        json.put("direction", direction);
        return json;
    }
}
