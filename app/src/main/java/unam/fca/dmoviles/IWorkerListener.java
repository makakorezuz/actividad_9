package unam.fca.dmoviles;

import org.json.JSONObject;

public interface IWorkerListener {
    void onNetworkSuccess(JSONObject jsonObject);
    void onNetworkError(String error);
}
