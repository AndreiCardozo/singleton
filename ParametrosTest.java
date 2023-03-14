package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeServidor() {
        Parametros.getInstance().setNomeServidor("Complexo");
        assertEquals("Complexo", Parametros.getInstance().getNomeServidor());
    }

    @Test
    public void deveRetornarSteamHex() {
        Parametros.getInstance().setSteamHex("1100001362a8f35");
        assertEquals("1100001362a8f35", Parametros.getInstance().getSteamHex());
    }

}