package padroescriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeServidor;
    private String steamHex;

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public String getSteamHex() {
        return steamHex;
    }

    public void setSteamHex(String steamHex) {
        this.steamHex = steamHex;
    }
}
