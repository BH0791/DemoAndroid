## CoordinatorLayout

<p>
CoordinatorLayout est un FrameLayout surpuissant.

CoordinatorLayout est destiné à deux cas d'utilisation principaux :

comme décor d'application de haut niveau ou disposition chromatique
En tant que conteneur pour une interaction spécifique avec une ou plusieurs vues enfant.
En spécifiant des comportements pour les vues enfant d'un CoordinatorLayout, vous pouvez fournir de nombreuses interactions différentes au sein d'un seul parent et ces vues peuvent également interagir les unes avec les autres. Les classes de vues peuvent spécifier un comportement par défaut lorsqu'elles sont utilisées en tant qu'enfant d'un CoordinatorLayout en implémentant l'interface AttachedBehavior.

Les comportements peuvent être utilisés pour mettre en œuvre toute une série d'interactions et de modifications supplémentaires de la présentation, allant des tiroirs et panneaux coulissants aux éléments amovibles par glissement et aux boutons qui se collent à d'autres éléments lorsqu'ils se déplacent et s'animent.

Les enfants d'un CoordinatorLayout peuvent avoir une ancre. Cet identifiant de vue doit correspondre à un descendant arbitraire du CoordinatorLayout, mais il ne peut pas être l'enfant ancré lui-même ou un descendant de l'enfant ancré. Ceci peut être utilisé pour placer des vues flottantes par rapport à d'autres panneaux de contenu arbitraires.

Les enfants peuvent spécifier insetEdge pour décrire comment la vue s'insère dans le CoordinatorLayout. Toutes les vues enfant qui sont définies pour esquiver les mêmes bords d'insertion par dodgeInsetEdges seront déplacées de manière appropriée afin que les vues ne se chevauchent pas.
</p>

*https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout*