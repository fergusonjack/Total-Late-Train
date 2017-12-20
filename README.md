# Total-Late-Train
Using Darwin and Huxley to calculate total late train times

## Building
This project uses Maven so to compile run in the main directory:

> mvn package

However, if you do not have Maven I have included a pre-compiled jar file which can be run while in the main directory:

> java -cp .\target\huxley-0.0.1-jar-with-dependencies.jar me.jackferg.main.Main

# System flow
This is done using the Darwin UK National Rail Live Departure Board SOAP API, this is then converted from SOAP to JSON 
by http://jack9283.azurewebsites.net/ which is forked from https://github.com/jpsingleton/Huxley. This is then parsed using code from 
http://restunited.com/releases/430721415517308710/wrappers however the code had to be modified to work correctly with the modern JSON
being passed through.

# TODO
  - migrate to a dataBase system
