README.txt, oblig 2, Espen H. Kristensen

Del A, spørsmål 4:
De to punktene i oppgave 2 av Del A uttrykker ganske klart at det er to metoder
som trengs. Ettersom det i begge tilfeller - ved utlåning og tilbakelevering -
kan lykkes eller mislykkes, har jeg valgt å returnere en boolsk "suksess"-
variabel, hvor man printer til STDERR og returnerer false dersom det går galt.
Valget av å ta inn laaner som String er ganske åpenbart (eneste alternativ var
å sende inn en Person-klasse eller lignende, men det har vi ikke i denne
oppgaven), mens valget om å ta inn et Bok-objekt muligens er mindre
åpenbart. Dette gjør jeg for å tillate at én person kan låne mer enn én bok.
Eneste andre alternativ ville være å legge inn både forfatter og tittel på
boken for å bruke det som identifikator, men det virker veldig tungvint i
forhold til alternativet jeg har valgt.

Generelt:
Igjen forholdsvis rett frem løsning, ingen store triks eller finurligheter
- noen små detaljer er kommentert i koden. Denne innleveringen inneholder
foreløbig ingen enhetstesting fra Del B, det tar jeg med dersom jeg ser
det verdt å legge ned tiden i det.

Foreløbig er kun deler av koden Javadoc'et, men jeg bør ha demonstrert
at jeg behersker teknikken ut fra det som er levert.


Spørsmål:
1) Hvordan synes du innleveringen var?
    A: Helt fin, har som tidligere nevnt hatt INF1010 i fjor så dette er
    grei plankekjøring.
2) Hvor lang tid (ca) brukte du på innleveringen?
    A: Cirka to timer.
3) Samarbeidet du med noen under innleveringen? Hvis ja, skriv brukernavn på den/de du samarbeidet med.
    A: Nei.
4) Var det noen oppgaver du ikke fikk til? Hvis ja:
    A: Nei, alt fungerer.
  a) Hvilke(n) oppgave er det som ikke fungerer i innleveringen?
  b) Hvorfor tror du at oppgaven ikke fungerer?
  c) Hva ville du gjort for å få oppgaven til å fungere hvis du hadde mer tid?
