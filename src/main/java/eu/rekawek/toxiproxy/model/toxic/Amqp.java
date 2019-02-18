package eu.rekawek.toxiproxy.model.toxic;

import com.google.gson.JsonObject;
import eu.rekawek.toxiproxy.HttpClient;
import eu.rekawek.toxiproxy.model.Toxic;
import eu.rekawek.toxiproxy.model.ToxicDirection;
import eu.rekawek.toxiproxy.model.ToxicType;

public class Amqp extends Toxic {
    public Amqp(HttpClient httpClient, String toxicListPath, String name, ToxicDirection stream) {
        super(httpClient, toxicListPath, name, stream);
    }

    public Amqp(HttpClient httpClient, String path, JsonObject json) {
        super(httpClient, path, json);
    }

    @Override
    protected void setAttributes(JsonObject attributes) {
        //someLocalProp = attributes.get("bytes").getAsLong();
    }

    @Override
    protected JsonObject getAttributes() {
        JsonObject attr = new JsonObject();
        //attr.addProperty("someLocalProp", bytes);
        return attr;
    }

    @Override
    protected ToxicType getType() {
        return ToxicType.AMQP;
    }
}
