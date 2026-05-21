package fr.univ_amu.iut.exercice4;

/// Kata 4 - Pagination.
///
/// Kata algorithmique avec beaucoup de cas limites. Idéal pour pratiquer la
/// **discipline TDD** : on active les tests dans l'ordre (du plus simple au plus
/// complexe) et on résiste à la tentation d'anticiper.
public class Pagination {

  private final int courant;
  private final int total;

  public Pagination(int courant, int total) {
    this.courant = courant;
    this.total = total;
  }

  /// Retourne la représentation textuelle de la barre de pagination.
  ///
  /// Format : pages séparées par des espaces, page courante entre parenthèses,
  /// `...` pour combler les trous quand il y a plus de 7 pages au total.
  public String afficher() {
    StringBuilder sortie = new StringBuilder();
    if (total <= 7) {
      for (int i = 0; i < total; i++) {
        if (courant == i + 1) {
          sortie.append("(" + (i + 1));
          if (i != total - 1) {
            sortie.append(") ");
          } else {
            sortie.append(")");
          }
        } else {
          sortie.append((i + 1));
          if (i != total - 1) {
            sortie.append(" ");
          }
        }
      }
    } else {
      if (courant != 1 & courant != 2) {
        sortie.append(1);
        if (courant == 3) {
          sortie.append(" ");
        }
      }
      if (courant != 2 & courant != 3) {
        sortie.append(" ... ");
      }
      sortie.append((courant - 1) + " ");
      sortie.append("(" + courant + ") ");
      sortie.append((courant + 1) + " ");
      if ((courant != total - 2) & (courant != total - 1)) {
        sortie.append("... ");
      }
      sortie.append(total);
    }
    // TODO kata 4 : construire la chaîne de pagination selon les règles
    // du README. Activez les tests dans l'ordre, ils vous guident :
    // - d'abord le cas "total <= 7" (affichage complet)
    // - puis le cas "beaucoup de pages" avec gestion des ellipses

    return sortie.toString();
  }
}
