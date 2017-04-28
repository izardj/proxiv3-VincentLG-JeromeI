# ProxiBanqueV3 - Vincent Le Gal - Jérôme Izard
Comment lancer l'application Java ProxiBanqueV3
Remarque : les messages d'erreurs ne sont pas tous implémentés (modification client par exemple).
Egalement, la mise en page via PrimeFace n'est pas trés finie.

## Pré-requis:
	- Machine cible dotée d'un systeme d'exploitation Windows.
		
	- Installer un serveur d'application Tomcat 9 sur la machine cible et s'assurer qu'il est lancé.

	(Téléchargé depuis : http://tomcat.apache.org/download-90.cgi)
			
	- Installer un serveur de base de donnée mySQL sur la machine cible et s'assurer qu'il est lancé.
		
	(Par exemple WAMPserver permet d'en installer un, il est téléchargeable depuis http://www.wampserver.com/)
			
	- Créer une base de donnée nommée : "proxiv3", définir son encodage "utf8_general_ci".
		
	(En utilisant par exemple phpMyAdmin fournit dans WAMPserver)
## Execution :
	- Créer et peupler les tables de la base de donnée en exécutant le fichier "SQL\proxiv3.sql"
		
	(dans phpMyAdmin en cliquant sur l'onglet import)
			
	- Copier le fichier "livraison\ProxiV3-VLG-JI.war" dans le repertoire "webapps" de Tomcat
		
	(ex: C:\apache-tomcat-9.0.0.M19\webapps, si Tomcat est installé dans C:\apache-tomcat-9.0.0.M19)
			
	- Accéder à l'application par un navigateur via l'url suivante "http://localhost:8080/ProxiV3-VLG-JI/"
		
	(le port 8080 dépend de votre configuration Tomcat)
	
	- Par défaut il y'a deux conseillers dans la base
		login : demo
		mot de passe : demo
		
		login : demo2
		mot de passe : demo2

## Consulter la documentation: 
	- Double-cliquer sur le fichier index.html se trouvant dans le repertoire "doc" livré avec le fichier jar.
