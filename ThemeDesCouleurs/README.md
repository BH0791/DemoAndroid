# Thème des couleurs
---
<p>Utilisation du système de thème des couleurs</p>

*Fichier colors.xml et themes.xml*

| Nom de l’attribut              | Description     |    Valeur par défaut    | 
|--------------------------------|-----------------|:-----------------------:|
| colorPrimary (couleurPrimaire) | La couleur qui s’affiche le plus fréquemment sur les écrans et les composants de votre application. Cette couleur doit respecter les directives d’accessibilité pour le texte / l’iconographie lorsqu’elle est dessinée au-dessus de la couleur de surface ou d’arrière-plan.                                                                                                                                                                       |         #6200EE         | 
| colorPrimaryVariant            | Variation tonale de la couleur primaire.                                                                                                                                                                                                                                                                                                                                                                                                            |         #3700B3         | 
| colorOnPrimary                 | Couleur qui respecte les consignes d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur principale.                                                                                                                                                                                                                                                                                                        |         #FFFFFF         | 
| couleurSecondaire              | La couleur de marque secondaire de l’application, généralement un complément accentué à la couleur de marque principale.                                                                                                                                                                                                                                                                                                                            |         #03DAC6         | 
| colorSecondaryVariant          | Variation tonale de la couleur secondaire.                                                                                                                                                                                                                                                                                                                                                                                                          |         #018786         | 
| colorOnSecondary               | Couleur qui répond aux directives d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur secondaire.                                                                                                                                                                                                                                                                                                         |         #000000         | 
| colorBackground                | La couleur d’arrière-plan apparaît derrière le contenu défilant.                                                                                                                                                                                                                                                                                                                                                                                    |         #FFFFFF         |
| colorOnBackground              | Une couleur qui respecte les directives d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur d’arrière-plan.                                                                                                                                                                                                                                                                                               |         #000000         |
| couleurSurface                 | Les couleurs de surface affectent les surfaces des composants, tels que les cartes, les feuilles et les menus.                                                                                                                                                                                                                                                                                                                                      |         #FFFFFF         |
| colorOnSurface                 | Couleur qui respecte les consignes d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur de surface.                                                                                                                                                                                                                                                                                                        |         #000000         |
| colorError (Erreur de couleur) | La couleur d’erreur indique les états d’erreur, pour les composants tels que les champs de texte                                                                                                                                                                                                                                                                                                                                                    |         #B00020         |
| colorOnError                   | Une couleur qui répond aux directives d’accessibilité pour le texte/l’iconographie lorsqu’elle est dessinée au-dessus de la couleur d’erreur.                                                                                                                                                                                                                                                                                                       |         #FFFFFF         |

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