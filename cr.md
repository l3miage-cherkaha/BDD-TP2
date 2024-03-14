Réponse Question 3 : 

On a choisi le mode d'héritage TABLE_PER_CLASS car selon notre hiérarchie,
on n'a pas assez de profondeur, assez de colonnes pour justifier l'usage
de la stratégie JOIN_CLASS, et on n'a pas voulu avoir des colonnes avec
la valeur NULL donc on n'a pas utilisé la stratégie SINGLE_TABLE.