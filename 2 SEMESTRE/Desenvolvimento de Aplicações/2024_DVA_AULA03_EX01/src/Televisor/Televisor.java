package Televisor;

public class Televisor {
    private int canal;
    private int volume;
    public static final int VOLUME_MINIMO = 0;
    public static final int VOLUME_MAX = 100;
    public static final int CANAL_MIN = 1;
    public static final int CANAL_MAX = 1000;

    public void aumentarCanal() {
        if (canal < CANAL_MAX) {
            canal++;
        }
    }

    public void diminuirCanal() {
        if (canal > CANAL_MIN) {
            canal--;
        }
    }

    public void aumentarVolume() {
        if (this.volume < VOLUME_MAX) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (this.volume > VOLUME_MINIMO) {
            volume--;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > CANAL_MIN && canal <= CANAL_MAX) {
            this.canal = canal;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= VOLUME_MINIMO && volume <= VOLUME_MAX) {
            this.volume = volume;
        }
    }


}
