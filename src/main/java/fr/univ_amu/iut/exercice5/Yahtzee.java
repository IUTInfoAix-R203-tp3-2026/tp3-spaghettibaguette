package fr.univ_amu.iut.exercice5;

/// Kata 5 - Yahtzee scoring.
///
/// Chaque méthode statique calcule le score selon sa règle pour un lancer de 5
/// dés. Le kata est un classique du refactoring (Yatzy Refactoring Kata) : les
/// solutions "brute-force" fonctionnent vite, mais vous verrez que certaines
/// règles partagent une structure (compter les occurrences de chaque face) qu'on
/// peut factoriser.
///
/// Conseil : implémentez chaque méthode en TDD puis, quand plusieurs sont
/// vertes, cherchez une factorisation. C'est un bon entraînement au
/// TP4 (Refactoring).
public class Yahtzee {

  private Yahtzee() {}

  /// Somme des 5 dés (quelle que soit leur valeur).
  public static int chance(int d1, int d2, int d3, int d4, int d5) {
    int somme = 0;
    // TODO kata 5 : sommer les 5 dés.
    somme = d1 + d2 + d3 + d4 + d5;
    return somme;
  }

  /// 50 points si les 5 dés sont identiques, 0 sinon.
  public static int yahtzee(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    // TODO kata 5 : 50 si d1 == d2 == d3 == d4 == d5, 0 sinon.
    if (d1 == d2 & d2 == d3 & d3 == d4 & d4 == d5) {
      score = 50;
    }
    return score;
  }

  /// Somme des dés qui montrent la face demandée (utilisé pour ones, twos,
  /// ..., sixes).
  public static int nombres(int face, int[] des) {
    int total = 0;
    // TODO kata 5 : additionner les dés qui valent 'face'.
    for (int i = 0; i < des.length; i = i + 1) {
      if (des[i] == face) {
        total += des[i];
      }
    }
    return total;
  }

  /// Valeur de la paire la plus haute (2 * valeur). 0 si aucune paire.
  public static int paire(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    int nb_occu_1 = 0;
    int nb_occu_2 = 0;
    int nb_occu_3 = 0;
    int nb_occu_4 = 0;
    int nb_occu_5 = 0;
    int nb_occu_6 = 0;
    if (d1 == 1) {
      nb_occu_1 += 1;
    } else if (d1 == 2) {
      nb_occu_2 += 1;
    } else if (d1 == 3) {
      nb_occu_3 += 1;
    } else if (d1 == 4) {
      nb_occu_4 += 1;
    } else if (d1 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d2 == 1) {
      nb_occu_1 += 1;
    } else if (d2 == 2) {
      nb_occu_2 += 1;
    } else if (d2 == 3) {
      nb_occu_3 += 1;
    } else if (d2 == 4) {
      nb_occu_4 += 1;
    } else if (d2 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d3 == 1) {
      nb_occu_1 += 1;
    } else if (d3 == 2) {
      nb_occu_2 += 1;
    } else if (d3 == 3) {
      nb_occu_3 += 1;
    } else if (d3 == 4) {
      nb_occu_4 += 1;
    } else if (d3 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d4 == 1) {
      nb_occu_1 += 1;
    } else if (d4 == 2) {
      nb_occu_2 += 1;
    } else if (d4 == 3) {
      nb_occu_3 += 1;
    } else if (d4 == 4) {
      nb_occu_4 += 1;
    } else if (d4 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d5 == 1) {
      nb_occu_1 += 1;
    } else if (d5 == 2) {
      nb_occu_2 += 1;
    } else if (d5 == 3) {
      nb_occu_3 += 1;
    } else if (d5 == 4) {
      nb_occu_4 += 1;
    } else if (d5 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    int max_occu = 0;
    int face_max = 0;
    if (max_occu <= nb_occu_1 & nb_occu_1 == 2) {
      max_occu = nb_occu_1;
      face_max = 1;
    }
    if (max_occu <= nb_occu_2 & nb_occu_2 == 2) {
      max_occu = nb_occu_2;
      face_max = 2;
    }
    if (max_occu <= nb_occu_3 & nb_occu_3 == 2) {
      max_occu = nb_occu_3;
      face_max = 3;
    }
    if (max_occu <= nb_occu_4 & nb_occu_4 == 2) {
      max_occu = nb_occu_4;
      face_max = 4;
    }
    if (max_occu <= nb_occu_5 & nb_occu_5 == 2) {
      max_occu = nb_occu_5;
      face_max = 5;
    }
    if (max_occu <= nb_occu_6 & nb_occu_6 == 2) {
      max_occu = nb_occu_6;
      face_max = 6;
    }

    score = face_max * 2;
    // TODO kata 5 : compter les occurrences de chaque face (1..6) puis
    // renvoyer 2 * la plus haute face qui apparaît au moins 2 fois.
    return score;
  }

  /// Somme de deux paires de valeurs différentes. 0 sinon.
  public static int deuxPaires(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    int nb_occu_1 = 0;
    int nb_occu_2 = 0;
    int nb_occu_3 = 0;
    int nb_occu_4 = 0;
    int nb_occu_5 = 0;
    int nb_occu_6 = 0;
    // TODO kata 5 : trouver deux faces distinctes qui apparaissent >= 2 fois.
    // if (paire1 != paire2) {
    // score = paire1 + paire2;
    // }
    if (d1 == 1) {
      nb_occu_1 += 1;
    } else if (d1 == 2) {
      nb_occu_2 += 1;
    } else if (d1 == 3) {
      nb_occu_3 += 1;
    } else if (d1 == 4) {
      nb_occu_4 += 1;
    } else if (d1 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d2 == 1) {
      nb_occu_1 += 1;
    } else if (d2 == 2) {
      nb_occu_2 += 1;
    } else if (d2 == 3) {
      nb_occu_3 += 1;
    } else if (d2 == 4) {
      nb_occu_4 += 1;
    } else if (d2 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d3 == 1) {
      nb_occu_1 += 1;
    } else if (d3 == 2) {
      nb_occu_2 += 1;
    } else if (d3 == 3) {
      nb_occu_3 += 1;
    } else if (d3 == 4) {
      nb_occu_4 += 1;
    } else if (d3 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d4 == 1) {
      nb_occu_1 += 1;
    } else if (d4 == 2) {
      nb_occu_2 += 1;
    } else if (d4 == 3) {
      nb_occu_3 += 1;
    } else if (d4 == 4) {
      nb_occu_4 += 1;
    } else if (d4 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d5 == 1) {
      nb_occu_1 += 1;
    } else if (d5 == 2) {
      nb_occu_2 += 1;
    } else if (d5 == 3) {
      nb_occu_3 += 1;
    } else if (d5 == 4) {
      nb_occu_4 += 1;
    } else if (d5 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    int nb_face_a_deux = 0;
    if (nb_occu_1 == 2) {
      nb_face_a_deux += 1;
    }
    if (nb_occu_2 == 2) {
      nb_face_a_deux += 1;
    }
    if (nb_occu_3 == 2) {
      nb_face_a_deux += 1;
    }
    if (nb_occu_4 == 2) {
      nb_face_a_deux += 1;
    }
    if (nb_occu_5 == 2) {
      nb_face_a_deux += 1;
    }
    if (nb_occu_6 == 2) {
      nb_face_a_deux += 1;
    }

    if (nb_face_a_deux == 2) {
      if (nb_occu_1 == 2) {
        score += 2 * 1;
      }
      if (nb_occu_2 == 2) {
        score += 2 * 2;
      }
      if (nb_occu_3 == 2) {
        score += 2 * 3;
      }
      if (nb_occu_4 == 2) {
        score += 2 * 4;
      }
      if (nb_occu_5 == 2) {
        score += 2 * 5;
      }
      if (nb_occu_6 == 2) {
        score += 2 * 6;
      }
    }
    return score;
  }

  /// Somme de 3 dés identiques, 0 sinon.
  public static int brelan(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    int nb_occu_1 = 0;
    int nb_occu_2 = 0;
    int nb_occu_3 = 0;
    int nb_occu_4 = 0;
    int nb_occu_5 = 0;
    int nb_occu_6 = 0;
    // TODO kata 5 : trouver la face qui apparaît au moins 3 fois, renvoyer 3 *
    // face.
    if (d1 == 1) {
      nb_occu_1 += 1;
    } else if (d1 == 2) {
      nb_occu_2 += 1;
    } else if (d1 == 3) {
      nb_occu_3 += 1;
    } else if (d1 == 4) {
      nb_occu_4 += 1;
    } else if (d1 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d2 == 1) {
      nb_occu_1 += 1;
    } else if (d2 == 2) {
      nb_occu_2 += 1;
    } else if (d2 == 3) {
      nb_occu_3 += 1;
    } else if (d2 == 4) {
      nb_occu_4 += 1;
    } else if (d2 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d3 == 1) {
      nb_occu_1 += 1;
    } else if (d3 == 2) {
      nb_occu_2 += 1;
    } else if (d3 == 3) {
      nb_occu_3 += 1;
    } else if (d3 == 4) {
      nb_occu_4 += 1;
    } else if (d3 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d4 == 1) {
      nb_occu_1 += 1;
    } else if (d4 == 2) {
      nb_occu_2 += 1;
    } else if (d4 == 3) {
      nb_occu_3 += 1;
    } else if (d4 == 4) {
      nb_occu_4 += 1;
    } else if (d4 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d5 == 1) {
      nb_occu_1 += 1;
    } else if (d5 == 2) {
      nb_occu_2 += 1;
    } else if (d5 == 3) {
      nb_occu_3 += 1;
    } else if (d5 == 4) {
      nb_occu_4 += 1;
    } else if (d5 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (nb_occu_1 >= 3) {
      score += 3 * 1;
    } else if (nb_occu_2 >= 3) {
      score += 3 * 2;
    } else if (nb_occu_3 >= 3) {
      score += 3 * 3;
    } else if (nb_occu_4 >= 3) {
      score += 3 * 4;
    } else if (nb_occu_5 >= 3) {
      score += 3 * 5;
    } else if (nb_occu_6 >= 3) {
      score += 3 * 6;
    }
    return score;
  }

  /// 15 si les 5 dés sont exactement 1-2-3-4-5, 0 sinon.
  public static int petiteSuite(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    int nb_occu_1 = 0;
    int nb_occu_2 = 0;
    int nb_occu_3 = 0;
    int nb_occu_4 = 0;
    int nb_occu_5 = 0;
    int nb_occu_6 = 0;
    // TODO kata 5 : vérifier que chaque face de 1 à 5 apparaît exactement une fois.
    if (d1 == 1) {
      nb_occu_1 += 1;
    } else if (d1 == 2) {
      nb_occu_2 += 1;
    } else if (d1 == 3) {
      nb_occu_3 += 1;
    } else if (d1 == 4) {
      nb_occu_4 += 1;
    } else if (d1 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d2 == 1) {
      nb_occu_1 += 1;
    } else if (d2 == 2) {
      nb_occu_2 += 1;
    } else if (d2 == 3) {
      nb_occu_3 += 1;
    } else if (d2 == 4) {
      nb_occu_4 += 1;
    } else if (d2 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d3 == 1) {
      nb_occu_1 += 1;
    } else if (d3 == 2) {
      nb_occu_2 += 1;
    } else if (d3 == 3) {
      nb_occu_3 += 1;
    } else if (d3 == 4) {
      nb_occu_4 += 1;
    } else if (d3 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d4 == 1) {
      nb_occu_1 += 1;
    } else if (d4 == 2) {
      nb_occu_2 += 1;
    } else if (d4 == 3) {
      nb_occu_3 += 1;
    } else if (d4 == 4) {
      nb_occu_4 += 1;
    } else if (d4 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d5 == 1) {
      nb_occu_1 += 1;
    } else if (d5 == 2) {
      nb_occu_2 += 1;
    } else if (d5 == 3) {
      nb_occu_3 += 1;
    } else if (d5 == 4) {
      nb_occu_4 += 1;
    } else if (d5 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (nb_occu_1 == 1 & nb_occu_2 == 1 & nb_occu_3 == 1 & nb_occu_4 == 1 & nb_occu_5 == 1) {
      score = 15;
    }
    return score;
  }

  /// 20 si les 5 dés sont exactement 2-3-4-5-6, 0 sinon.
  public static int grandeSuite(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    int nb_occu_1 = 0;
    int nb_occu_2 = 0;
    int nb_occu_3 = 0;
    int nb_occu_4 = 0;
    int nb_occu_5 = 0;
    int nb_occu_6 = 0;
    if (d1 == 1) {
      nb_occu_1 += 1;
    } else if (d1 == 2) {
      nb_occu_2 += 1;
    } else if (d1 == 3) {
      nb_occu_3 += 1;
    } else if (d1 == 4) {
      nb_occu_4 += 1;
    } else if (d1 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d2 == 1) {
      nb_occu_1 += 1;
    } else if (d2 == 2) {
      nb_occu_2 += 1;
    } else if (d2 == 3) {
      nb_occu_3 += 1;
    } else if (d2 == 4) {
      nb_occu_4 += 1;
    } else if (d2 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d3 == 1) {
      nb_occu_1 += 1;
    } else if (d3 == 2) {
      nb_occu_2 += 1;
    } else if (d3 == 3) {
      nb_occu_3 += 1;
    } else if (d3 == 4) {
      nb_occu_4 += 1;
    } else if (d3 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d4 == 1) {
      nb_occu_1 += 1;
    } else if (d4 == 2) {
      nb_occu_2 += 1;
    } else if (d4 == 3) {
      nb_occu_3 += 1;
    } else if (d4 == 4) {
      nb_occu_4 += 1;
    } else if (d4 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (d5 == 1) {
      nb_occu_1 += 1;
    } else if (d5 == 2) {
      nb_occu_2 += 1;
    } else if (d5 == 3) {
      nb_occu_3 += 1;
    } else if (d5 == 4) {
      nb_occu_4 += 1;
    } else if (d5 == 5) {
      nb_occu_5 += 1;
    } else {
      nb_occu_6 += 1;
    }

    if (nb_occu_2 == 1 & nb_occu_3 == 1 & nb_occu_4 == 1 & nb_occu_5 == 1 & nb_occu_6 == 1) {
      score = 20;
    }
    return score;
  }

  /// Somme des 5 dés si on a un brelan plus une paire d'une autre valeur,
  /// 0 sinon.
  public static int full(int d1, int d2, int d3, int d4, int d5) {
    int score = 0;
    // TODO kata 5 : un brelan (une face 3 fois) + une paire (autre face 2 fois).
    if (brelan(d1, d2, d3, d4, d5) != 0 & paire(d1, d2, d3, d4, d5) != 0) {
      score = chance(d1, d2, d3, d4, d5);
    }
    return score;
  }
}
