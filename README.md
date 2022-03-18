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
- [CONFIGURAZIONE:key:](#configurazionekey)
- [DOCUMENTAZIONE:open_book:](#documentazioneopen_book)
- [TEST APPLICAZIONE:gear:](#test-applicazionegear)
- [AUTORI:it::student:](#autori-del-progettoitstudent)
- [LICENSE:speech_balloon:](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/blob/main/LICENSE)
- [ESEMPIO INTERFACCIA:computer:](#esempio-interfacciacomputer)



###                                    CONFIGURAZIONE:key:
Se sei arrivato fin qui a leggere significa proprio che sei un fanta-allenatore accanito che ha solo la vittoria in testa, bene! 
In questa sezione del progetto  abbiamo inserito passo passo tutto quello che c'è da fare per inziare a preparare questo progetto che abbiamo in mente.

#### Fase 1: Scelta e download ambiente di sviluppo.
Ovviamente noi siamo partiti da un ambiente di sviluppo, o IDE, ovvero un software il quale ci ha permesso di realizzare la nostra applicazione, che ci ha detto il professore di utilizzare, ma tu che leggi puoi usarne un altro se vuoi. Noi abbiamo usato Eclipse e lo abbiamo scaricato da internet (ti lascio qui il link per scaricarlo se vuoi usarlo anche tu :wink: [Link Download Eclipse](https://www.eclipse.org/downloads/)). Ora che l'ambiente è pronto abbiamo scaricato E-Git dal marketplace di Eclipse per far si che possiamo controllare e nel caso aggiustare il nostro progetto anche da eclipse stesso. Sempre dal marketplace bisogna anche scaricare Spring Tools|4 che ci porterà così alla seconda fase del progetto.
#### Fase 2: Spring Tools|4 e Spring Initializr.
Come introdotto nella fase precedente, dopo aver scaricato i tools per Spring Boot,abbiamo utlizzato Spring Initializr, ovvero un framework utilizzato per creare delle applicazioni basate sui framework di Java Spring (per questo abbiamo scaricato in precedenza i tools) utilizzati specialmente per creare dei microservizi e utlizzarli come abbiamo fatto noi in questo caso per il nostro progetto. In questo modo da Spring Initializr abbiamo ottenuto un progetto Maven zip che abbiamo decompresso e poi importate su Eclipse cosi da avere il nostro IDE con il framework dove far nascere la nostra applicazione.

<img width="1265" alt="Schermata 2022-03-02 alle 18 56 02" src="https://user-images.githubusercontent.com/99751208/156421034-2e32d994-c6a9-457f-9883-91fa92968543.png">

 - Queste le dependencies che ci ha fatto aggiungere il professore prima di generare il progetto maven.
 
Una volta importato il progetto Maven zip, il prof ci ha consigliato, per vedere se tutto era andato a buon, di farlo partire come una Spring Boot App e vedere se nella console c'era la dicitura "Tomcat started on port(s):8080", in quanto significava che se era presente tale scrittura tutto era andato a buon fine e che quindi scrivendo localhost:8080 il framework su internet dava una risposta.(Come plus abbiamo anche cambiato la porta scrivendo nell'Application Properties del progetto server.port:8081 per vedere se anche con un'altra porta andasse bene).

#### Fase 3: Inizio vero e proprio del Progetto
Dopo aver fatto i passi iniziali noi abbiamo cominciato a suddividere il nostro progetto su eclipse in package e classi cosi da avere un organizzazione ben precisa di ciò che ci serve e che dovevamo utilizzare per la realizzazione del nostro lavoro.


<img width="214" alt="Schermata 2022-03-17 alle 18 37 10" src="https://user-images.githubusercontent.com/99751208/158861755-1eafae1c-8c3f-4938-a2d8-a201bcaab36d.png">

Abbiamo diviso, senza toccare il package creato in automatico da maven, il nostro Assistente fantacalcio in 3 package fondamentali:
- Package del Service -> Il quale,con i suoi sottopacchetti che inseriremo noi a seconda di quanti ce ne servono, serve per gestire i nostri servizi.
- Package del Model -> I membri di questo pacchetto e dei suoi relativi sottopacchetti sono destinati all'uso nella modellazione del linguaggio.
- Package del Controller -> Il quale è usato, lui insieme a tutti i pacchetti che inseriamo al suo interno, per contenere le rotte del progetto e ci permette di ottenere delle risposta a ciò che richiediamo.(esso è collegato anche alle interfacce grafiche)
- Package Exception -> ovvero il package che serve per gestire le situazioni anomale,in modo molto più ordinato, che si potrebbero andare a creare durante l'avvio o l'uso del programma.

#### Fase 4: Struttura e suddivisione del progetto
Prima di cominciare a fare un progetto bisogna avere le idee ben precise di come farlo.Noi abbiamo deciso di strutturarlo nei tre package riportati in precedenza ma ovviamente non bastano solo quelli! Innanzitutto prima di tutto dobbiamo creare tutte i package utili che ci servono per creare una Fantalega nel quale poi il nostro Fanta Assistente ci potrà aiutare dandoci dei consigli. All'interno infatti dei package iniziali abbiamo inserito:

Package | Classi | A cosa servono?
-- | :--: | :--:
Model | DifferenzaReti,Giocatore,GolSegnatiInTotale,MediaAssist,MediaGolFatti,MediaGolSegnatiSquadra,MediaGolSubiti,MediaGolSubitiSquadra,Squadra,Stats| Qui ci saranno tutti i package che vi faranno capire come abbiamo strutturato il progetto e come lo abbiamo suddiviso
Service | FormazioneService,FormazioneServiceImpl| Tutti i package che troverete all'interno di esso servono per gestire i servizi dell app 
Controller |AssistenteFantacalcioController,FormazioneController | All'interno di esso ci saranno tutte le classi e i pacchetti che collegheranno le rotte per far si che il programma funzioni e che giri facendo si che i test che faremo del programma su postman funzionino correttamente.

#### Fase 5: Creazione Classi del Model
Noi siamo partiti dalla costruzione del nostro package Model, ovvero il pacchetto dove inseriremo tutte le classi necessarie per dare una struttura ben precisa al nostro progetto e che serve per accedere a tutti i dati utili dell'applicazione.(per arrivare subito al model del progetto e vederlo nella sua interezza cliccare [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/tree/main/AssistenteFantacalcio/src/main/java/it/univpm/AssistenteFantacalcio/model)).

<img width="231" alt="Schermata 2022-03-18 alle 10 32 51" src="https://user-images.githubusercontent.com/99751208/158977722-ddd43006-25f4-4d0e-9196-fc3c7c80d96a.png">


#### Fase 6: Creazione Classi del Service
Come passo successivo nello sviluppo del nostro software abbiamo creato tutte le classi appartenenti al nostro Service,il quale ci fa vedere  i dati contenuti nel model e che si occupa dell'interazione con utenti e agenti. 
(Per arrivare subito al controller del progetto e vederlo nella sua interezza cliccare [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/tree/main/AssistenteFantacalcio/src/main/java/it/univpm/AssistenteFantacalcio/service)).

<img width="194" alt="Schermata 2022-03-17 alle 18 43 25" src="https://user-images.githubusercontent.com/99751208/158863243-51d836b9-59d0-4a20-8b34-6f1dcf05ea16.png">

#### Fase 7: Creazione Classi del Controller
Dopo aver terminato la creazione dei precedenti due èacchetti principali ,noi siamo passati al costruire il package Controller, ovvero, come detto già in precedenza, colui che  servirà per ricevere i comandi dell'utente,attraverso il package service, mettendoli in pratica modificando allo stesso tempo lo stato degli altri due componenti.(per arrivare subito al controller del progetto e vederlo nella sua interezza cliccare [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/tree/main/AssistenteFantacalcio/src/main/java/it/univpm/AssistenteFantacalcio/controller)).

<img width="255" alt="Schermata 2022-03-10 alle 18 33 28" src="https://user-images.githubusercontent.com/99751208/157721682-5b05a065-1d67-4afd-bea6-69c2054febc1.png">


#### Fase 8: Creazione del Menù .
Nella classe AssistenteFantacalcioController abbiamo creato il menù che viene stampato a schermo e permette all'utente di fare cio che abbiamo descritto nella sezione [ESEMPIO INTERFACCIA](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/blob/main/README.md#esempio-interfacciacomputer).

<img width="586" alt="Schermata 2022-03-17 alle 18 52 20" src="https://user-images.githubusercontent.com/99751208/158864937-fc6d81b7-ffca-4ab1-9a77-3ee96f9a5dc2.png">

Ecco come il menù viene visualizzato su Postman

https://user-images.githubusercontent.com/99751208/158959471-81847d46-ac29-48b2-9fb8-8defcfd0faf4.mp4





###                                    DOCUMENTAZIONE:open_book:
- Come scritto in precedenza abbiamo preso i dati per le statistiche dei calciatori da [qui](https://www.fantacalcio.it/statistiche-serie-a) scaricando anche il   file che ho riportato sopra in formato pdf, situato [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/blob/main/Statistiche_Fantacalcio_2021-22-2.pdf), che contiene una tabella con nome, squadra di appartenenza del calciatore, mediavoto,mediafantavoto,rigori parati(se portiere il calciatore in questione), rigori sbagliati e segnati (se il giocatore in questione è di movimento), ammonizioni, espulsioni e assist. Inoltre abbiamo anche inserito il file in un altro formato, il quale lo abbiamo messo [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/blob/main/Statistiche_Fantacalcio_2021-22-2.xlsx),che abbiamo utilizzato poi per creare il file json, [inserito qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/tree/main/AssistenteFantacalcio/jsonfiles) per usarlo su eclipse per la costruzione del nostro progetto sull'IDE, eclipse appunto.
- Inoltre abbiamo inserito tutta la documentazione Javadoc utile per migliorare la comprensione del codice sorgente.(situata tutta all'interno del programma prima di ogni classe o paramentro che abbiamo definito)
- Per visualizzare le eccezioni andare [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/tree/main/AssistenteFantacalcio/src/main/java/it/univpm/AssistenteFantacalcio/exception).



###                                    TEST APPLICAZIONE:gear:
Questa sezione l'abbiamo utilizzata per inserire dei test che abbiamo fatto per verificare che tutto il progetto girasse correttamente. Test fatti attraverso postman.

a)Qui potete vedre come noi abbiamo eseguito su postman,tramite la Get, il comando /database con il quale abbiamo ottenuto la lista di giocatori con tutte le varie statistiche appartenenti al file Json che avevamo caricato in precedenza.

https://user-images.githubusercontent.com/99751208/158898499-855ec8ec-3883-472a-8712-5b8257b341e8.mp4

b)Dopo aver richiamato /database, tramite la  Get di postman e dopo aver creato i nomi dei giocatori di cui volevamo avere le statistiche (:rotating_light:Mi raccomando per creare,scrivere per esempio {"nome":VLAHOVIC} e usare la Post, scrivere il nome del giocatore tutto in maiuscolo e il nome tutto in minuscolo entrambi tra doppie virgolette e separati dai due punti senno darà errore. Poi lanciare il comando /giocatori e così facendo si ottengono tutte le statistiche(nome,squadra,ruolo,mediaVoto,mediaFantaVoto...) dei giocatori chiamati in precedenza.

https://user-images.githubusercontent.com/99751208/158898999-ec1b9ddb-4c43-470b-b373-4b533f27cd43.mp4

c)Dopo aver svolto i primi due comandi, se per esempio avevamo richiesto i dati di un giocatore che in realtà non volevamo(l'esempio nel video è stato fatto con Vlhaovic), ora possiamo lanciare il comando Delete per togliere dalla lista il giocatore che non volevamo vedere più.

https://user-images.githubusercontent.com/99751208/158899514-e8176710-e514-44c8-9d8d-b7f34cfaecdd.mp4

d)Un altro comando utile è lo /squadra che ti permette di avere tutte le statistiche riguardanti una squadra reale (il posizionamento in classifica, i suoi punti, quante partite ha vinto,perso o pareggiato,i gol subiti) in modo tale che quando si va a scegliere i giocatori della tua fantaSquadra li scegli al meglio senza sbagliare.(:rotating_light:Attenzione come per lo slash squadra bper richiamare questa funzione bisogna scrivere {"nomeSquadra":"Juventus"}, ovvero con nomeSquadra scritto in UpperCamelCAse e la squadra in questione con l'iniziale in maiuscolo)

d1)Come con lo /giocatori,attraverso il comando Get di postman si può ottenere, dopo aver scritto  {"nomeSquadra":"Juventus"} con Post, tutte le statistiche inerenti alla squadra o alle squadre di cui si vogliono conoscere tali dati.(qui l'esempio è stato fatto con la Juventus ottenendo tutte le statistiche che volevamo che abbiamo inserito nella classe squadra nel model)

https://user-images.githubusercontent.com/99751208/158959989-bdd76bb1-a7ed-41ae-853f-ff159b4f9b86.mp4

d2)Infine:
- Dopo aver ottenuto la lista di squadra con Get
- Dopo che noi abbiamo scritto {"nomeSquadra":"Juventus"} e {"nomeSquadra":"Bologna"} per creare con la Post e con la Get ottenere queste due squadre
- Si puo togliere con la Delete di Postman una squadra che, forse per sbaglio, avevi chiesto le statistiche(l'esempio lo abbiamo fatto con Juventus e Bologna usando la delete su qeust'utlima squadra).

https://user-images.githubusercontent.com/99751208/158960957-be68fa06-c387-4f95-bb0c-9a91ce2d5af0.mp4





###                                    ESEMPIO INTERFACCIA:computer:

<img width="1432" alt="Schermata 2022-03-17 alle 18 04 08" src="https://user-images.githubusercontent.com/99751208/158855796-ab2428d1-ef87-400b-8514-7c2731cd62fa.png">

Noi abbiamo utilizzato Visual Studio Code, scaricato [a questo link](https://code.visualstudio.com) per la scrittura e creazione del file html per l'esempio di interfaccia che ci siamo immaginati dovesse avere il programma.
I Tre principali sono /database , /giocatori e /squadra(con il loro relativo utilizzo e scopo)
- Questo è come vorremmo che si mostrasse la nostra applicazione ad un utente che la volesse utilizzare. Il file html dell'interfaccia è [qui](https://github.com/Daniel-Diocis/Progetto-assistente-fantacalcio/blob/main/EsempioInterfaccia.html). Ovviamente i tasti che si vedono integrati nel build dell'html non sono collegati e perciò non svolgono alcuna funzione, in quanto non abbiamo implementato tale interfaccia ad Eclipse.
- Inoltre, oltre ai comandi sopra elencati di /database e /giocatori è possibile, nel Delete di postman scrivendo /giocatori/GIOCATOREDACANCELLARE, cancellare il calciatore scelto nella lista prima ottenuta con il comando /database.
- L'ultimo comando che abbiamo implementato è lo /squadra ovvero il comando che ti permette di avere tutte le statistiche della squadra che ti serve per scegliere i tuoi fantagiocatori al meglio e non sbagliare; statistiche come il posizionamento in classifica, i suoi punti, quante partite ha vinto,perso o pareggiato,i gol subiti cosi nel caso si voglia scegliere il portiere a seconda di quanti gol ha subito quella squdra, tu scegli il miglior portiere in circolazione.(stesso tipo di ragionamento lo si puo fare per difensori,centrocampisti e attacanti a seconda dei gol fatti dalla squadra)


###                                    AUTORI DEL PROGETTO:it::student:
Nome | Matricola | Contributo
-- | :--: | :--:
[Flati Enrico Maria](https://github.com/EnricoMariaFlati) | 1099114 | File Readme,Esempio Interfaccia con Visual Sudio Code, Sviluppo Software programma,Javadoc,Test Applicazione
[Diocis Calero Daniel](https://github.com/Daniel-Diocis) | 1090161 | File Readme,Esempio Interfaccia con Visual Sudio Code, Sviluppo Software programma,Javadoc,Test Applicazione







