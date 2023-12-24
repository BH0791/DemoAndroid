# Thème des couleurs *(Theme.Material3.Light.NoActionBar)*
---
<p>Utilisation du système de thème des couleurs</p>

**Surface** : rôle utilisé pour les arrière-plans et les grandes zones à faible accentuation de l’écran.<br>

**Primaire**, **Secondaire**, **Tertiaire** : rôles de couleur d’accentuation utilisés pour accentuer ou atténuer l’accentuation des éléments de premier plan.<br>

**Conteneur** : rôles utilisés comme couleur de remplissage pour les éléments de premier plan tels que les boutons. Ils ne doivent pas être utilisés pour du texte ou des icônes.<br>

**Activé** : les rôles commençant par ce terme indiquent une couleur pour le texte ou les icônes au-dessus de la couleur parent associée. Par exemple, sur primary est utilisé pour le texte et les icônes par rapport à la couleur de remplissage principale.<br>

**Variant** : les rôles se terminant par ce terme offrent une alternative moins importante à sa paire non variante. Par exemple, la variante de contour est une version moins accentuée de la couleur de contour.<br><br>

*Fichier colors.xml et themes.xml*<br>
*Il peut s'agir d'une valeur de couleur, sous la forme "#rgb", "#argb", "#rrggbb" ou "#aarrggbb".*

| Nom de l’attribut              | Description                                                                                                                                                                                                                                                                   | Valeur par défaut | 
|--------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------------:|
| colorPrimary (couleurPrimaire) | La couleur qui s’affiche le plus fréquemment sur les écrans et les composants de votre application. Cette couleur doit respecter les directives d’accessibilité pour le texte / l’iconographie lorsqu’elle est dessinée au-dessus de la couleur de surface ou d’arrière-plan. |      #6200EE      | 
| colorPrimaryVariant            | Variation tonale de la couleur primaire.                                                                                                                                                                                                                                      |      #3700B3      | 
| colorOnPrimary                 | Couleur qui respecte les consignes d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur principale.                                                                                                                                  |      #FFFFFF      | 
| couleurSecondaire              | La couleur de marque secondaire de l’application, généralement un complément accentué à la couleur de marque principale. *(remplissages, texte et icônes moins visibles par rapport à la surface)*                                                                            |      #03DAC6      | 
| colorSecondaryVariant          | Variation tonale de la couleur secondaire.                                                                                                                                                                                                                                    |      #018786      | 
| colorOnSecondary               | Couleur qui répond aux directives d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur secondaire. *(texte et icônes sur le secondaire*)                                                                                             |      #000000      | 
| colorBackground                | La couleur d’arrière-plan apparaît derrière le contenu défilant.                                                                                                                                                                                                              |      #FFFFFF      |
| colorOnBackground              | Une couleur qui respecte les directives d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur d’arrière-plan.                                                                                                                         |      #000000      |
| couleurSurface                 | Les couleurs de surface affectent les surfaces des composants, tels que les cartes, les feuilles et les menus.                                                                                                                                                                |      #FFFFFF      |
| colorOnSurface                 | Couleur qui respecte les consignes d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur de surface.                                                                                                                                  |      #000000      |
| colorError (Erreur de couleur) | La couleur d’erreur indique les états d’erreur, pour les composants tels que les champs de texte                                                                                                                                                                              |      #B00020      |
| colorOnError                   | Une couleur qui répond aux directives d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur d’erreur.                                                                                                                                 |      #FFFFFF      |
| colorPrimaryDark               | Couleur de la barre d’état et de l’application contextuelle Bars; il s’agit normalement d’une version sombre de colorPrimary.                                                                                                                                                 |                   |
| colorAccent                    | Complément lumineux de la couleur principale de l'image de marque. Par défaut, c'est la couleur appliquée aux contrôles du cadre (via colorControlActivated).                                                                                                                 |                   |
| textColorPrimary               | Définit la couleur de votre texte en dehors de la barre d’action                                                                                                                                                                                                              |                   |
| windowBackground               | N’affecte que l’arrière-plan de la fenêtre principale définit la couleur du fond de votre application.                                                                                                                                                                        |                   |
| colorSecondaryContainer        | Couleur de remplissage moins proéminente par rapport à la surface, pour les composants récessifs tels que les boutons tonaux                                                                                                                                                  |                   |
| colorOnSecondaryContainer      | Texte et icônes sur le conteneur secondaire                                                                                                                                                                                                                                   |                   |
| colorTertiary                  | Remplissages, texte et icônes complémentaires par rapport à la surface                                                                                                                                                                                                        |                   |
| colorOnTertiary                | Texte et icônes contre tertiaire                                                                                                                                                                                                                                              |                   |
| colorTertiaryContainer         | Couleur de conteneur complémentaire par rapport à la surface, pour les composants tels que les champs de saisie                                                                                                                                                               |                   |
| colorOnTertiaryContainer       | Texte et icônes sur le conteneur tertiaire                                                                                                                                                                                                                                    |                   |
| colorErrorContainer            | Couleur de remplissage qui attire l’attention sur la surface                                                                                                                                                                                                                  |                   |
| colorOnErrorContainer          | Texte et icônes sur le conteneur d’erreur                                                                                                                                                                                                                                     |                   |
| colorSurfaceContainer          | couleur à faible accentuation pour le texte et les icônes par rapport à n’importe quelle couleur de surface                                                                                                                                                                   |                   |
| colorSurfaceContainerLowest    | Couleur du conteneur le moins accentué                                                                                                                                                                                                                                        |                   |
| colorSurfaceContainerLow       | Couleur du conteneur à faible accentuation                                                                                                                                                                                                                                    |                   |
| colorSurfaceContainerHigh      | Couleur de conteneur à forte accentuation                                                                                                                                                                                                                                     |                   |
| colorSurfaceContainerHighest   | Couleur du conteneur la plus accentuée                                                                                                                                                                                                                                        |                   |

# Primaire

Utilisez les rôles principaux pour les composants les plus importants de l’interface utilisateur, tels que les boutons à accentuation élevée et les états actifs.

# Secondary

Utilisez des rôles secondaires pour les composants moins importants de l’interface utilisateur, tels que les puces de filtre.

# Tertiary

Utilisez des rôles tertiaires pour des accents contrastés qui équilibrent les couleurs primaires et secondaires ou attirent l’attention sur un élément tel qu’un champ de saisie. Les rôles de couleur tertiaire peuvent être appliqués à la discrétion du concepteur. Ils sont destinés à prendre en charge une expression plus large des couleurs.

# Surface

Utilisez des rôles de surface pour des arrière-plans plus neutres et des couleurs de conteneur pour des composants tels que des cartes, des feuilles et des boîtes de dialogue.

# Inverse colors

Les rôles inverses sont appliqués de manière sélective aux composants pour obtenir des couleurs inverses de celles de l’interface utilisateur environnante, créant ainsi un effet de contraste.

# Outline

Il existe deux couleurs de contour à utiliser sur la surface :<br>
Contour : limites importantes, telles qu’un contour de champ de texte<br>
Variante de contour – Éléments décoratifs, tels que des séparateurs
Fixed accent colors

# Fixed accent colors

La plupart des produits n’auront pas besoin d’utiliser ces rôles de couleur complémentaires. Cependant, certains produits nécessitent la plus grande flexibilité et le plus grand contrôle qu’offrent les rôles complémentaires. Si vous n’êtes pas sûr que votre produit doive utiliser les rôles complémentaires, ce n’est probablement pas le cas et vous pouvez les ignorer.

# On fixed accent colors

Les couleurs fixes sont utilisées pour le texte et les icônes qui se trouvent au-dessus de la couleur fixe correspondante.  Par exemple, sur la couleur fixe principale est utilisé pour le texte et les icônes par rapport à la couleur fixe principale. Le même usage s’applique pour les couleurs secondaires et tertiaires équivalentes.

# Bright and dim surface roles

Il existe deux rôles de surface complémentaires :<br>
Surface dim – Couleur de surface la plus faible dans les thèmes clairs et sombres<br>
Surface lumineuse - Couleur de surface la plus brillante dans les thèmes clairs et sombres



```
<resources>
  <color name="color_primary">...</color>
  <color name="color_surface">...</color>
</resources>
```

```
<resources>
  <color name="brand_blue">...</color>
  <color name="brand_grey">...</color>
</resources>
```

```
<style name="Widget.MyApp.Button" parent="Widget.MaterialComponents.Button">
  <item name="backgroundTint">?attr/colorSecondary</item>
</style>
```