package fr.univ_amu.iut.exercice2;

/// Kata 2 - Jeu de tennis.
///
/// Classe d'état qui gère le scoring d'un jeu de tennis entre deux joueurs.
/// Pratique idéale pour découvrir comment structurer une **machine à états** et
/// comment un test bien nommé devient une spécification lisible.
public class JeuDeTennis {

  private final String joueur1;
  private final String joueur2;
  private int points1;
  private int points2;

  public JeuDeTennis(String joueur1, String joueur2) {
    this.joueur1 = joueur1;
    this.joueur2 = joueur2;
  }

  /// Enregistre un point pour le joueur dont le nom est passé en argument.
  public void marquerPoint(String joueur) {
    // TODO kata 2 : incrémenter le compteur du joueur qui vient de marquer.
    if (joueur == joueur1) {
      if (points1 == 0 || points1 == 15) {
        points1 += 15;
      } else {
        points1 += 10;
      }
    } else {
      if (points2 == 0 || points2 == 15) {
        points2 += 15;
      } else {
        points2 += 10;
      }
    }
  }

  /// Retourne la représentation textuelle du score courant.
  public String getScore() {
    // TODO kata 2 : construire la chaîne du score en gérant les cas :
    String score = "0-0";
    // - après Égalité, un joueur mène d'un point : "Avantage <nom>"
    if (points1 == 50 || points2 == 50) {
      if (points1 - points2 == 10) {
        score = "Avantage " + joueur1;
        return score;
      } else if (points2 - points1 == 10) {
        score = "Avantage " + joueur2;
        return score;
      }
    }
    // - <4 points chacun et pas d'égalité à 40 : "X-Y" (ex "15-30")
    if (points1 != 40 || points2 != 40) {
      if (points1 < 50 & points2 < 50) {
        score = points1 + "-" + points2;
        return score;
      }
    }
    // - égalité >=3 : "Égalité"
    if (points1 >= 40 & points2 >= 40) {
      if (points1 == points2) {
        score = "Égalité";
        return score;
      }
    }
    // - un joueur a 4 points et 2 d'avance : "Jeu pour <nom>"
    if (points1 >= 50 & points1 - points2 >= 20) {
      score = "Jeu pour " + joueur1;
      return score;
    } else if (points2 >= 50 & points2 - points1 >= 20) {
      score = "Jeu pour " + joueur2;
      return score;
    }
    return score;
  }
}
