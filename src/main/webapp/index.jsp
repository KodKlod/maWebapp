<html>
<body>
<h1>Mon application Web en Java</h1>

Ceci est une page statique.
<!-- affichage du prénom en appelant @MadvocAction framework JODD -->
<p> J'affiche mon prénom ${prenom}</p> <!-- syntaxe EL (Expression language) -->


<!-- Comment afficher l'équipe de San Fransisco -->
<!-- select NAME from TEAMS
	where CITY='San Francisco';

	select FNAME, LNAME from PLAYERS, TEAMS
	where CITY='San Francisco'
	order by LNAME;
 -->
<p> Et là j'affiche le nom de l'équipe de San Francisco  ${nom}</p>
</body>
</html>
