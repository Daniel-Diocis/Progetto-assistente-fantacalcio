# Logo Assistente Fantacalcio
<div align="center">
  
![CamScanner.02-27-2022.17.25.pdf](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/files/8155208/CamScanner.02-27-2022.17.25.pdf)
  
# Progetto Programmazione Ad Oggetti
##                                      ASSISTENTE FANTACALCIO
 
</div>
<div align="center">

###                                     INTRODUZIONE:it:
  
</div>

Il fantacalcio è un gioco virtuale basato sul calcio, nella quale tu puoi immedesimarti nei panni di un fanta-allenatore e creare la rosa più forte acquistando giocatori, appartenenti alla realtà tramite un'asta,utilizzando dei fanta-crediti, progredendo nella lega ottenendo punti grazie alle giocate di tali giocatori come per esempio assist, goal. Da qualche anno a questa parte è sorto un grande interesse per questo gioco virtuale, ora non so se tu che stai leggendo giochi al fantacalcio o vorresti cominciare, ma sicuramente le domande che trovo piu spesso, o alle volte mi faccio io stesso, sono le seguenti:
- C'è un modo che schierare prima dell'inzio della giornata la formazione giusta senza sbagliare?
- Inserisco sempre tutti i giocatori che mi permettono di avere più punti alla fine oppure no?

Ecco riferendomi a queste domande più frequenti, io e il mio compagno, anche lui fanta-allenatore come me, Daniel, vogliamo creare una sorta di Fanta-Assistente che aiuti ogni fanta-allentore prima di ogni giornata del fanta-calcio nello scegliere bene sempre modulo,formazione e calciatori da schierare in ogni singolo ruolo così da poter diventare il più forte di tutti!

<div align="center">

###                                     INTRODUCTION:england:
  
</div>

Fantasy football is a virtual game based on football, in which you can put yourself in the shoes of a fantasy coach and create the strongest squad by buying players, belonging to reality through an auction, using fantasy credits, progressing in the league by obtaining points thanks to the plays of such players as for example assists, goals. For some years now a great interest has arisen in this virtual game, now I don't know if you who are reading games of fantasy football or would like to start, but surely the questions I find most often, or sometimes I ask myself, are the following:
- Is there a way to deploy the right line-up before the start of the day without making a mistake?
- Do I always insert all the players who allow me to have the most points at the end or not?

Here, referring to these most frequently asked questions, my partner and I, also a fantasy-coach like me, Daniel, want to create a sort of Fantasy-Assistant that helps every fantasy-lover before each day of fantasy football in always choosing well module, formation and players to be deployed in every single role so that you can become the strongest of all!
  
###                                  CONTENUTI PROGETTO:open_file_folder::it:
- [DESCRIZIONE E REGOLAMENTO DEL PROGETTO:it:](#itdescrizione-e-regolamento-del-progettoit)
- [DESCRIPTION AND REGULATION OF THE PROJECT:england:](#englanddescription-and-regulation-of-the-projectengland)
- [CONFIGURAZIONE:key:](#configurazionekey)
- [DOCUMENTAZIONE:open_book:](#documentazioneopen_book)
- [AUTORI:it::student:](#autori-del-progettoitstudent)
- [LICENSE](#license)

###                                :it:DESCRIZIONE E REGOLAMENTO DEL PROGETTO:it:  
L'utente attraverso un menù dell'applicazione avrà la possibilità di:
-  Chiedere chi è meglio schierare tra, per esempio,due giocatori confrontando,attraverso l'analisi delle loro fantamedie nelle ultime partite, il loro rendimento;
-  L'utente prima inseirà il modulo scelto secondo lui e poi l'assistente avrà il compito di modificarlo facendo vedere all'allenatore quale sia meglio;
-  Inserire i calciatori e poi chiedere all'assistente se vanno bene o cambiarli automaticamente in caso contrario.

Ogni giocatore inserito ha un suo indice di schierabilità che va da 0 a 99. Questo indice prima riportato va in base a un algoritmo(da definire) che dipende dal ruolo del giocatore (se si mette a confronto dell'assistente un difensore con una fantamedia di 7, nelle ultime 5 giornate, e un centrocampista con la stessa media, è ovvio che l'assistente ti consiglierà di mettere il difensore). Ovviamente, sempre riguardo all'esempio precedente, l'assistente non vedrà solo il voto ma anche se, per esempio, ha giocato titolare o da subentrato o se ha giocato con squadre meno forti della sua secondo gli standard del campionato. Tutti questi dati verranno presi da [Statistiche Fantacalcio](https://www.fantacalcio.it/statistiche-serie-a).


###                                 :england:DESCRIPTION AND REGULATION OF THE PROJECT:england:
Through an application menu, the user will have the possibility to:
- Ask who is better to line up between, for example, two players by comparing, through the analysis of their fantamedies in the last games, their performance;
- The user will first insert the module chosen according to him and then the assistant will have the task of modifying it by showing the coach which is better;
- Insert the players and then ask the assistant if they are good or change them automatically if not.

Each player inserted has its own deployability index ranging from 0 to 99. This index previously reported is based on an algorithm (to be defined) that depends on the player's role (if a defender is compared to an assistant with a fantamedia of 7, in the last 5 days, and a midfielder with the same average, it is obvious that the assistant will advise you to put the defender). Obviously, again with regard to the previous example, the assistant will not only see the vote but also if, for example, he has played a starter or a substitute or if he has played with teams that are less strong than his according to the standards of the championship. All these data will be taken from [Fantasy Football Statistics](https://www.fantacalcio.it/statistiche-serie-a).

###                                    CONFIGURAZIONE:key:
Se sei arrivato fin qui a leggere significa proprio che sei un fanta-allenatore accanito che ha solo la vittoria in testa, bene! 
In questa sezione del progetto io e il mio amico Daniel abbiamo inserito passo passo tutto quello che c'è da fare per inziare a preparare questo progetto che abbiamo in mente.

#### Fase 1: Scelta e download ambiente di sviluppo.
Ovviamente io e Daniel siamo partiti da un ambiente di sviluppo, o IDE, ovvero un software il quale ci ha permesso di realizzare la nostra applicazione, che ci ha detto il professore di utilizzare, ma tu che leggi puoi usarne un altro se vuoi. Noi abbiamo usato Eclipse e lo abbiamo scaricato da internet (ti lascio qui il link per scaricarlo se vuoi usarlo anche tu :wink: [Link Download Eclipse](https://www.eclipse.org/downloads/)). Ora che l'ambiente è pronto abbiamo scaricato E-Git dal marketplace di Eclipse per far si che possiamo controllare e nel caso aggiustare il nostro progetto anche da eclipse stesso. Sempre dal marketplace bisogna anche scaricare Spring Tools|4 che ci porterà così alla seconda fase del progetto.
#### Fase 2: Spring Tools|4 e Spring Initializr.
Come introdotto nella fase precedente, dopo aver scaricato i tools per Spring Boot,abbiamo utlizzato Spring Initializr, ovvero un framework utilizzato per creare delle applicazioni basate sui framework di Java Spring (per questo abbiamo scaricato in precedenza i tools) utilizzati specialmente per creare dei microservizi e utlizzarli come abbiamo fatto noi in questo caso per il nostro progetto. In questo modo da Spring Initializr abbiamo ottenuto un progetto Maven zip che abbiamo decompresso e poi importate su Eclipse cosi da avere il nostro IDE con il framework dove far nascere la nostra applicazione.

<img width="1265" alt="Schermata 2022-03-02 alle 18 56 02" src="https://user-images.githubusercontent.com/99751208/156421034-2e32d994-c6a9-457f-9883-91fa92968543.png">

 - Queste le dependencies che ci ha fatto aggiungere il professore prima di generare il progetto maven.
 
Una volta importato il progetto Maven zip, il prof ci ha consigliato, per vedere se tutto era andato a buon, di farlo partire come una Spring Boot App e vedere se nella console c'era la dicitura "Tomcat started on port(s):8080", in quanto significava che se era presente tale scrittura tutto era andato a buon fine e che quindi scrivendo localhost:8080 il framework su internet dava una risposta.(Come plus abbiamo anche cambiato la porta scrivendo nell'Application Properties del progetto server.port:8081 per vedere se anche con un'altra porta andasse bene).

#### Fase 3: Inizio vero e proprio del Progetto
Dopo aver fatto i passi iniziali noi abbiamo cominciato a suddividere il nostro progetto su eclipse in package e classi cosi da avere un organizzazione ben precisa di ciò che ci serve e che dovevamo utilizzare per la realizzazione del nostro lavoro.


<img width="291" alt="Schermata 2022-03-03 alle 18 04 02" src="https://user-images.githubusercontent.com/99751208/156614587-e2f80c63-2f21-4527-8b0b-a0276f5d1a6a.png"> 

Abbiamo diviso, senza toccare il package creato in automatico da maven, il nostro Assistente fantacalcio in 3 package fondamentali:
- Package del Service -> Il quale,con i suoi sottopacchetti che inseriremo noi a seconda di quanti ce ne servono, serve per gestire i nostri servizi.
- Package del Model -> I membri di questo pacchetto e dei suoi relativi sottopacchetti sono destinati all'uso nella modellazione del linguaggio.
- Package del Controller -> Il quale è usato, lui insieme a tutti i pacchetti che inseriamo al suo interno, per contenere le rotte del progetto e ci permette di ottenere delle risposta a ciò che richiediamo.(esso è collegato anche alle interfacce grafiche)

#### Fase 4: Struttura e suddivisione del progetto
Prima di cominciare a fare un progetto bisogna avere le idee ben precise di come farlo.Noi abbiamo deciso di strutturarlo nei tre package riportati in precedenza ma ovviamente non bastano solo quelli! Innanzitutto prima di tutto dobbiamo creare tutte i package utili che ci servono per creare una Fantalega nel quale poi il nostro Fanta Assistente ci potrà aiutare dandoci dei consigli. All'interno infatti dei package iniziali abbiamo inserito:

Package | Classi | A cosa servono?
-- | :--: | :--:
Model | Campionato-Classifica-Formazione-Giocatore-Giornata-GiornataVitaReale-Partita-FantaAllenatore-FantaSquadra-Storico-Voto| Qui ci saranno tutti i package che vi faranno capire come abbiamo strutturato il progetto e come lo abbiamo suddiviso
Service | Database | Tutti i package che troverete all'interno di esso servono per l'interfaccia che l'utente,una volta che verrà aprta la webapp trovera di fronte a esso.
Controller | | All'interno di esso ci saranno tutte le classi e i pacchetti che collegheranno le rotte alle interfaccie per far si che il programma funzioni.



###                                    DOCUMENTAZIONE:open_book:

###                                    AUTORI DEL PROGETTO:it::student:
Nome | Matricola | Contributo
-- | :--: | :--:
[Flati Enrico Maria](https://github.com/EnricoMariaFlati) | 1099114 | File Readme,
[Diocis Calero Daniel](https://github.com/Daniel-Diocis) | 







