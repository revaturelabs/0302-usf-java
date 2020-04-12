#this is a bash script
#bash stands for bourne again shell
#unix commands:
# ls:		list sub-folders
# touch:	creates a new file
# chmod:	changes the access rights to the file
#		numbers after chmod correspond to user_group_public
#		numbers are: 1-read, 2-write, 3-read&write, 4-execute, 5-read&execute, 6w-write&execute, 7-rwe
# vim:		file editor in the command line
# nano:		file editor in the command line
# yum:		package manager
#	update:	update installed packages
#	install:install packages
#	remove:	remove packages
# sudo:		assume super user role
# su:		log into super user
# echo:		print to terminal
# clear		clear the terminal
# logout:	logout of current sessio
# cd:		change directory
#	./	same directory
#	../	parent directory
#	/	root folder
# pwd		present working directory
# scp		copy over ssh connection
#	scp [options] [host1]:[file] [host2]:[location]
#	ex: 	scp -i keys/0302Ec2.pem ./target/HelloTomcat-SNAPSHOT-0.0.1.war ec2-user@publicDns:/home/ec2-user
echo hello world
