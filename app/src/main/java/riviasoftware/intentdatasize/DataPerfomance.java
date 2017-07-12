package riviasoftware.intentdatasize;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergiolizanamontero on 12/7/17.
 */

public class DataPerfomance {

    private static DataPerfomance dataInstance = new DataPerfomance();

    private final Map<String, Object> datos = new HashMap<>();

    private DataPerfomance() {
    }

    public static DataPerfomance getInstance() {
        return dataInstance;
    }

    public Object getExtra(String name) {
        return datos.get(name);
    }

    public boolean hasExtra(String name) {
        return datos.containsKey(name);
    }

    public void putExtra(String name, Object object) {
        datos.put(name, object);
    }


}



