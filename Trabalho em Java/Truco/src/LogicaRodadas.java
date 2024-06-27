package src;

import java.util.Comparator;
import java.util.List;

public class LogicaRodadas {

    public Carta jogar(Carta cartaNaMesa, List<Carta> cartas) {
        if (primeiroAJogar(cartaNaMesa)) {
            return JogaAMaiorCarta(cartas);
        } else {
            List<Carta> cartasMaioresDaMesa = separaAsCartasMaioresQueADaMesa(cartaNaMesa, cartas);
            if (!cartasMaioresDaMesa.isEmpty()) {
                return jogarAMenorCarta(cartasMaioresDaMesa);
            } else {
                return jogarAMenorCarta(cartas);
            }
        }

//
//        public Carta terceiraJoga (Carta cartaNaMesa, List < Carta > cartas){
//            if (cartas.size() == 1) {
//                Carta cartaAlta = cartas.stream()
//                        .max(Comparator.comparingInt((c1) -> c1.valor))
//                        .get();
//                if (cartaAlta.valor >= 130 && cartaAlta.valor <= 130000) {
//                    return cartaAlta;
//                } else {
//                    Carta caraSecundaria = cartas.stream()
//                            .max(Comparator.comparingInt((c1) -> c1.numero))
//                            .get();
//                    return caraSecundaria;
//                }
//            }
//            return cartaNaMesa;
//        }
    }

    private static boolean primeiroAJogar(Carta cartaNaMesa) {
        return cartaNaMesa == null;
    }

    private static Carta JogaAMaiorCarta(List<Carta> cartas) {
        Carta cartaAlta = cartas.stream()
                .max(Comparator.comparingInt((c1) -> c1.valor))
                .orElse(null);
        assert cartaAlta != null;
        return cartaAlta;
    }

    private static List<Carta> separaAsCartasMaioresQueADaMesa(Carta cartaNaMesa, List<Carta> cartas) {
        List<Carta> cartasMaioresDaMesa = cartas.stream()
                .filter(carta -> cartaNaMesa.valor.compareTo(carta.valor) >= 1)
                .toList();
        return cartasMaioresDaMesa;
    }

    private static Carta jogarAMenorCarta(List<Carta> cartasMaioresDaMesa) {
        return cartasMaioresDaMesa.stream()
                .min(Comparator.comparing((c1) -> c1.valor))
                .orElse(null);
    }


}
