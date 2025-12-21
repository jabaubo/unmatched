package proyecto.unmatched;

import java.util.ArrayList;

public class Controlador {
    ArrayList<Mapa> mapas2Jugadores = new ArrayList<>();
    ArrayList<Mapa> mapas4Jugadores = new ArrayList<>();

    ArrayList<Personaje> personajes = new ArrayList<>();
    ArrayList<Personaje> personajesTierS = new ArrayList<>();
    ArrayList<Personaje> personajesTierA = new ArrayList<>();
    ArrayList<Personaje> personajesTierB = new ArrayList<>();
    ArrayList<Personaje> personajesTierC = new ArrayList<>();
    ArrayList<Personaje> personajesTierD = new ArrayList<>();
    ArrayList<Personaje> personajesTierE = new ArrayList<>();

    ArrayList<Set> Sets = new ArrayList<>();
    ArrayList<Villano> villanos = new ArrayList<>();
    ArrayList<Jefe> jefes = new ArrayList<>();

    ArrayList<ModificadorPartida> modificadorPartidas = new ArrayList<>();
    ArrayList<ModificadorPartida> modificadorSecreto = new ArrayList<>();


    public Controlador() {

        //Mapas 2 jugadores
        Mapa j2_azuchi_castle = new Mapa(2, "Castillo Azuchi", R.drawable.j2_azuchi_castle);
        Mapa j2_heorot = new Mapa(2, "Heorot", R.drawable.j2_heorot);
        Mapa j2_king_solomons_mine = new Mapa(2, "Mina del Rey Salomón", R.drawable.j2_king_solomons_mine);
        Mapa j2_t_rex_paddock = new Mapa(2, "Recinto del T-Rex", R.drawable.j2_t_rex_paddock);

        mapas2Jugadores.add(j2_azuchi_castle);
        mapas2Jugadores.add(j2_heorot);
        mapas2Jugadores.add(j2_king_solomons_mine);
        mapas2Jugadores.add(j2_t_rex_paddock);

        //Mapas 4 jugadores
        Mapa j_baskerville_manor = new Mapa(4, "Mansión de los Baskerville ", R.drawable.j_baskerville_manor);
        Mapa j_globe_theatre = new Mapa(4, "Teatro Globe", R.drawable.j_globe_theatre);
        Mapa j_hanging_gardens = new Mapa(4, "Jardines colgantes", R.drawable.j_hanging_gardens);
        Mapa j_hells_kitchen = new Mapa(4, "Hell's Kitchen", R.drawable.j_hells_kitchen);
        Mapa j_marmoreal = new Mapa(4, "Marmoreal", R.drawable.j_marmoreal);
        Mapa j_navy_pier = new Mapa(4, "Muelle de la armada", R.drawable.j_navy_pier);
        Mapa j_sarpedon = new Mapa(4, "Sarpedón", R.drawable.j_sarpedon);
        Mapa j_soho = new Mapa(4, "Sojo", R.drawable.j_soho);
        Mapa j_the_raft = new Mapa(4, "La Balsa", R.drawable.j_the_raft);

        mapas4Jugadores.add(j_baskerville_manor);
        mapas4Jugadores.add(j_globe_theatre);
        mapas4Jugadores.add(j_hanging_gardens);
        mapas4Jugadores.add(j_hells_kitchen);
        mapas4Jugadores.add(j_marmoreal);
        mapas4Jugadores.add(j_navy_pier);
        mapas4Jugadores.add(j_sarpedon);
        mapas4Jugadores.add(j_soho);
        mapas4Jugadores.add(j_the_raft);


        // Tier S
        Personaje elektra = new Personaje("Elektra", "S");
        Personaje goldenBat = new Personaje("Golden Bat", "S");
        Personaje nikolaTesla = new Personaje("Nikola Tesla", "S");
        Personaje sherlockHolmes = new Personaje("Sherlock Holmes", "S");
        Personaje yennenga = new Personaje("Yennenga", "S");
        Personaje medusa = new Personaje("Medusa", "S");
        Personaje drStrange = new Personaje("Dr Strange", "S");
        Personaje yenneferTriss = new Personaje("Yennefer & Triss", "S");
        Personaje ciri = new Personaje("Ciri", "S");

        personajes.add(elektra);
        personajes.add(goldenBat);
        personajes.add(nikolaTesla);
        personajes.add(sherlockHolmes);
        personajes.add(yennenga);
        personajes.add(medusa);
        personajes.add(drStrange);
        personajes.add(yenneferTriss);
        personajes.add(ciri);

        personajesTierS.add(elektra);
        personajesTierS.add(goldenBat);
        personajesTierS.add(nikolaTesla);
        personajesTierS.add(sherlockHolmes);
        personajesTierS.add(yennenga);
        personajesTierS.add(medusa);
        personajesTierS.add(drStrange);
        personajesTierS.add(yenneferTriss);
        personajesTierS.add(ciri);

        // Tier A
        Personaje aquiles = new Personaje("Aquiles", "A");
        Personaje drJillTrent = new Personaje("Dr. Jill Trent", "A");
        Personaje houdini = new Personaje("Houdini", "A");
        Personaje littleRedRidingHood = new Personaje("Caperucita Roja", "A");
        Personaje lukeCage = new Personaje("Luke Cage", "A");
        Personaje moonKnight = new Personaje("Moon Knight", "A");
        Personaje sunWukong = new Personaje("Sun Wukong", "A");
        Personaje sinbad = new Personaje("Sinbad", "A");
        Personaje bigfoot = new Personaje("Bigfoot", "A");
        Personaje shehulk = new Personaje("Shehulk", "A");
        Personaje eredin = new Personaje("eredin", "A");
        Personaje ancientLeshen = new Personaje("Ancient Leshen", "A");
        Personaje blackBeard = new Personaje("Black Beard", "A");

        personajes.add(aquiles);
        personajes.add(drJillTrent);
        personajes.add(houdini);
        personajes.add(littleRedRidingHood);
        personajes.add(lukeCage);
        personajes.add(moonKnight);
        personajes.add(sunWukong);
        personajes.add(sinbad);
        personajes.add(bigfoot);
        personajes.add(shehulk);
        personajes.add(eredin);
        personajes.add(ancientLeshen);
        personajes.add(blackBeard);

        personajesTierA.add(aquiles);
        personajesTierA.add(drJillTrent);
        personajesTierA.add(houdini);
        personajesTierA.add(littleRedRidingHood);
        personajesTierA.add(lukeCage);
        personajesTierA.add(moonKnight);
        personajesTierA.add(sunWukong);
        personajesTierA.add(sinbad);
        personajesTierA.add(bigfoot);
        personajesTierA.add(shehulk);
        personajesTierA.add(eredin);
        personajesTierA.add(ancientLeshen);
        personajesTierA.add(blackBeard);

        // Tier B
        Personaje daredevil = new Personaje("Daredevil", "B");
        Personaje dracula = new Personaje("Drácula", "B");
        Personaje ghostRider = new Personaje("Ghost Rider", "B");
        Personaje tRex = new Personaje("T. Rex", "B");
        Personaje theGenie = new Personaje("The Genie", "B");
        Personaje tomoeGozen = new Personaje("Tomoe Gozen", "B");
        Personaje blackWidow = new Personaje("Black Widow", "B");
        Personaje winterSoldier = new Personaje("Winter Soldier", "B");
        Personaje titania = new Personaje("Titania", "B");
        Personaje robertMuddon = new Personaje("Robert Muddon", "B");
        Personaje raptors = new Personaje("Raptors", "B");
        Personaje pandora = new Personaje("Pandora", "B");
        Personaje loki = new Personaje("Loki", "B");
        Personaje michelangelo = new Personaje("Michelangelo", "B");
        Personaje leonardo = new Personaje("Leonardo", "B");
        Personaje donatello = new Personaje("Donatello", "B");
        Personaje raphael = new Personaje("Raphael", "B");

        personajes.add(daredevil);
        personajes.add(dracula);
        personajes.add(ghostRider);
        personajes.add(tRex);
        personajes.add(theGenie);
        personajes.add(tomoeGozen);
        personajes.add(blackWidow);
        personajes.add(winterSoldier);
        personajes.add(titania);
        personajes.add(robertMuddon);
        personajes.add(raptors);
        personajes.add(pandora);
        personajes.add(loki);
        personajes.add(michelangelo);
        personajes.add(leonardo);
        personajes.add(donatello);
        personajes.add(raphael);

        personajesTierB.add(daredevil);
        personajesTierB.add(dracula);
        personajesTierB.add(ghostRider);
        personajesTierB.add(tRex);
        personajesTierB.add(theGenie);
        personajesTierB.add(tomoeGozen);
        personajesTierB.add(blackWidow);
        personajesTierB.add(winterSoldier);
        personajesTierB.add(titania);
        personajesTierB.add(robertMuddon);
        personajesTierB.add(raptors);
        personajesTierB.add(pandora);
        personajesTierB.add(loki);
        personajesTierB.add(michelangelo);
        personajesTierB.add(leonardo);
        personajesTierB.add(donatello);
        personajesTierB.add(raphael);

        // Tier C
        Personaje annieChristmas = new Personaje("Annie Christmas", "C");
        Personaje beowulf = new Personaje("Beowulf", "C");
        Personaje bloodyMary = new Personaje("Bloody Mary", "C");
        Personaje bullseye = new Personaje("Bullseye", "C");
        Personaje drEllieSattler = new Personaje("Dr. Ellie Sattler", "C");
        Personaje msMarvel = new Personaje("Ms. Marvel", "C");
        Personaje blackPanther = new Personaje("Black Panther", "C");
        Personaje alicia = new Personaje("Alicia", "C");
        Personaje shakespeare = new Personaje("Shakespeare", "C");
        Personaje hermanasFatidicas = new Personaje("Hermanas Fatídicas", "C");
        Personaje robinHood = new Personaje("Robin hood", "C");
        Personaje philippa = new Personaje("Philippa", "C");
        Personaje geralt = new Personaje("Geralt of Rivia", "C");
        Personaje chupacabra = new Personaje("Chupacabra", "C");
        Personaje bruceLee = new Personaje("Bruce Lee", "C");

        personajes.add(annieChristmas);
        personajes.add(beowulf);
        personajes.add(bloodyMary);
        personajes.add(bullseye);
        personajes.add(drEllieSattler);
        personajes.add(msMarvel);
        personajes.add(blackPanther);
        personajes.add(alicia);
        personajes.add(shakespeare);
        personajes.add(hermanasFatidicas);
        personajes.add(robinHood);
        personajes.add(philippa);
        personajes.add(geralt);
        personajes.add(chupacabra);
        personajes.add(bruceLee);

        personajesTierC.add(annieChristmas);
        personajesTierC.add(beowulf);
        personajesTierC.add(bloodyMary);
        personajesTierC.add(bullseye);
        personajesTierC.add(drEllieSattler);
        personajesTierC.add(msMarvel);
        personajesTierC.add(blackPanther);
        personajesTierC.add(alicia);
        personajesTierC.add(shakespeare);
        personajesTierC.add(hermanasFatidicas);
        personajesTierC.add(robinHood);
        personajesTierC.add(philippa);
        personajesTierC.add(geralt);
        personajesTierC.add(chupacabra);
        personajesTierC.add(bruceLee);


        // Tier D
        Personaje invisibleMan = new Personaje("El Hombre Invisible", "D");
        Personaje jekyllHyde = new Personaje("Jekyll & Hyde", "D");
        Personaje odaNobunaga = new Personaje("Oda Nobunaga", "D");
        Personaje cloakYDagger = new Personaje("Cloak y Dagger", "D");
        Personaje reyArturo = new Personaje("Rey Arturo", "D");
        Personaje hamlet = new Personaje("Hamlet", "D");
        Personaje deadpool = new Personaje("deadpool", "D");
        Personaje buffy = new Personaje("Buffy", "D");
        Personaje spiderMan = new Personaje("Spider Man", "D");

        personajes.add(invisibleMan);
        personajes.add(jekyllHyde);
        personajes.add(odaNobunaga);
        personajes.add(cloakYDagger);
        personajes.add(reyArturo);
        personajes.add(hamlet);
        personajes.add(deadpool);
        personajes.add(buffy);
        personajes.add(spiderMan);

        personajesTierD.add(invisibleMan);
        personajesTierD.add(jekyllHyde);
        personajesTierD.add(odaNobunaga);
        personajesTierD.add(cloakYDagger);
        personajesTierD.add(reyArturo);
        personajesTierD.add(hamlet);
        personajesTierD.add(deadpool);
        personajesTierD.add(buffy);
        personajesTierD.add(spiderMan);

        //Tier E
        Personaje squirrelGirl = new Personaje("Squirrel Girl", "E");
        Personaje spike = new Personaje("Spike", "E");
        Personaje willow = new Personaje("Willow", "E");
        Personaje angel = new Personaje("Angel", "E");

        personajes.add(squirrelGirl);
        personajes.add(spike);
        personajes.add(willow);
        personajes.add(angel);

        personajesTierE.add(squirrelGirl);
        personajesTierE.add(spike);
        personajesTierE.add(willow);
        personajesTierE.add(angel);

        //Sets
        Set battleOfLegends1 = new Set("Batalla de Leyendas 1");
        Set cobbleAndFog = new Set("Cobble & Fog");
        Set caperucitaBeowoulf = new Set("Caperucita VS Beowulf");
        Set battleOfLegends2 = new Set("Batalla de Leyendas 2");
        Set redemptionsRow = new Set("Redepmtions Row");
        Set hellsKitchen = new Set("Hell's Kitchen");
        Set sattlerTRex = new Set("Jurassic Park - Sattler VS T-Rex");
        Set houdiniGenio = new Set("Houdini VS El Genio");
        Set teenSpirit = new Set("Teen Spirit");
        Set forKingAndCountry = new Set("For King And Country");
        Set talesToAmaze = new Set("Relatos Asombrosos");
        Set sunsOrigin = new Set("El origen del sol");
        Set slingAndArrows = new Set("Sling And Arrows");

        Set robinHoodBigfoot = new Set("Robin Hood VS Bigfoot");
        Set deadpoolSet = new Set("Deadpool");
        Set ingenRaptors = new Set("Jurassic Park - Ingen VS Raptors");
        Set buffyVampireSlayer = new Set("Buffy the Vampire Slayer");
        Set battleOfLegends3 = new Set("Batalla de Leyendas 3");
        Set witcherSteelSilver = new Set("The Witcher - Steel & Silver");
        Set witcherRealmsFall = new Set("The Witcher - Realms Fall");
        Set adventuresTMNT = new Set("Adventures: Teenage Mutant Ninja Turtles");
        Set brainsAndBrawn = new Set("Brains and Brawn");
        Set aliVsBruceLee = new Set("Muhammad Ali VS Bruce Lee");


        witcherSteelSilver.add(geralt);
        witcherSteelSilver.add(ciri);
        witcherSteelSilver.add(ancientLeshen);

        witcherRealmsFall.add(philippa);
        witcherRealmsFall.add(yenneferTriss);
        witcherRealmsFall.add(eredin);

        aliVsBruceLee.add(bruceLee);

        brainsAndBrawn.add(shehulk);
        brainsAndBrawn.add(spiderMan);
        brainsAndBrawn.add(drStrange);

        adventuresTMNT.add(leonardo);
        adventuresTMNT.add(raphael);
        adventuresTMNT.add(michelangelo);
        adventuresTMNT.add(donatello);

        robinHoodBigfoot.add(robinHood);
        robinHoodBigfoot.add(bigfoot);

        deadpoolSet.add(deadpool);

        ingenRaptors.add(robertMuddon);
        ingenRaptors.add(raptors);

        buffyVampireSlayer.add(buffy);
        buffyVampireSlayer.add(willow);
        buffyVampireSlayer.add(spike);
        buffyVampireSlayer.add(angel);

        battleOfLegends3.add(chupacabra);
        battleOfLegends3.add(pandora);
        battleOfLegends3.add(blackBeard);
        battleOfLegends3.add(loki);



        talesToAmaze.add(nikolaTesla);
        talesToAmaze.add(drJillTrent);
        talesToAmaze.add(goldenBat);
        talesToAmaze.add(annieChristmas);

        slingAndArrows.add(shakespeare);
        slingAndArrows.add(hamlet);
        slingAndArrows.add(titania);
        slingAndArrows.add(hermanasFatidicas);

        battleOfLegends1.add(medusa);
        battleOfLegends1.add(sinbad);
        battleOfLegends1.add(reyArturo);
        battleOfLegends1.add(alicia);

        battleOfLegends2.add(aquiles);
        battleOfLegends2.add(sunWukong);
        battleOfLegends2.add(bloodyMary);
        battleOfLegends2.add(yennenga);

        cobbleAndFog.add(sherlockHolmes);
        cobbleAndFog.add(dracula);
        cobbleAndFog.add(jekyllHyde);
        cobbleAndFog.add(invisibleMan);

        hellsKitchen.add(daredevil);
        hellsKitchen.add(bullseye);
        hellsKitchen.add(elektra);

        redemptionsRow.add(lukeCage);
        redemptionsRow.add(moonKnight);
        redemptionsRow.add(ghostRider);

        teenSpirit.add(msMarvel);
        teenSpirit.add(squirrelGirl);
        teenSpirit.add(cloakYDagger);

        forKingAndCountry.add(blackWidow);
        forKingAndCountry.add(blackPanther);
        forKingAndCountry.add(winterSoldier);


        sattlerTRex.add(drEllieSattler);
        sattlerTRex.add(tRex);

        caperucitaBeowoulf.add(littleRedRidingHood);
        caperucitaBeowoulf.add(beowulf);

        houdiniGenio.add(houdini);
        houdiniGenio.add(theGenie);

        sunsOrigin.add(tomoeGozen);
        sunsOrigin.add(odaNobunaga);

        Sets.add(talesToAmaze);
        Sets.add(hellsKitchen);
        Sets.add(battleOfLegends2);
        Sets.add(caperucitaBeowoulf);
        Sets.add(slingAndArrows);


        Sets.add(battleOfLegends1);
        Sets.add(cobbleAndFog);
        Sets.add(redemptionsRow);
        Sets.add(sattlerTRex);
        Sets.add(houdiniGenio);
        Sets.add(teenSpirit);
        Sets.add(forKingAndCountry);
        Sets.add(sunsOrigin);

        Sets.add(robinHoodBigfoot);
        Sets.add(deadpoolSet);
        Sets.add(ingenRaptors );
        Sets.add(buffyVampireSlayer);
        Sets.add(battleOfLegends3);
        Sets.add(witcherSteelSilver);
        Sets.add(witcherRealmsFall);
        Sets.add(adventuresTMNT);
        Sets.add(brainsAndBrawn);
        Sets.add(aliVsBruceLee);


        //Jefes
        Jefe hombrePolilla = new Jefe("El Hombre Polilla");
        Jefe invasorDeMarte = new Jefe("El Invasor de Marte");

        jefes.add(hombrePolilla);
        jefes.add(invasorDeMarte);

        //Villanos
        Villano diabloDeJersey = new Villano("Diablo de Jersey");
        Villano ranaDeLoveland = new Villano("Rana de Loveland");
        Villano tarantula = new Villano("Tarántula");
        Villano amorfo = new Villano("Amorfo");
        Villano monoMofeta = new Villano("Mono Mofeta");
        Villano reinaHormiga = new Villano("Reina Hormiga");

        villanos.add(diabloDeJersey);
        villanos.add(ranaDeLoveland);
        villanos.add(tarantula);
        villanos.add(amorfo);
        villanos.add(monoMofeta);
        villanos.add(reinaHormiga);

        //Modificadores de partida
        ModificadorPartida hayQueCompartir = new ModificadorPartida("Mi mami dice que hay que compartir", "Si en combate una carta jugada tiene un efecto que solo afecte al jugador que la ha jugado " +
                ", también afecta a su oponente si no involucra una mecánica , carta o sidekick propio del personaje");
        ModificadorPartida hacerseUnFede = new ModificadorPartida("Hacerse un Fede", "Los personajes pierden su pasiva y las cartas no tienen efectos");
        ModificadorPartida cambioDeSitio = new ModificadorPartida("Cambio de sitio", "El valor impreso pasa a ser el de boosteo y el de boosteo el impreso");
        ModificadorPartida peroTuEstasDaltonico = new ModificadorPartida("¿Pero tú eres daltónico?", "Durante este turno las cartas de defensa son de ataque y las de ataque son de defensa");
        ModificadorPartida cartasEnMano = new ModificadorPartida("¿Cartas en mano?", "El jugador tiene como tamaño máximo de mano el valor de vida que tenía su personaje al empezar la partida,en su siguiente turno su límite pasará a ser 1 menos si su límite 7,cada turno se reducirá el doble que el turno anterior hasta llegar a 7 ,  \nEjemplo: 14,13,11,7 \nSI ES DESCUBIERTO CON MÁS CARTAS EN MANO QUE EL VALOR DE SU LÍMITE SI EL LÍMITE ES MAYOR A 7, DEBE DESCARTARSE DE SU MANO DE FORMA ALEATORIA HASTA IGUALAR SU LÍMITE, DESPUÉS DESCARTA ESA MISMA CANTIDAD DE LA PARTE SUPERIOR DE LA BARAJA\nEjemplo:14 cartas en mano con límite de 11 , se descarta 3 aleatorias de su mano y 3 de la parte superior de la baraja ");
        ModificadorPartida gambling = new ModificadorPartida("Let's go gamblinggg", "La cantidad de casillas que te mueves, las cartas que robas , los valores impreso y de boosteo de cada carta , y los valores en los efectos de estas se ven sustituidos por una tirada de un dado de 6 caras \nANTES DE CADA TIRADA DEBES ESPECIFICAR PARA QUÉ ES");
        ModificadorPartida callaitoTete = new ModificadorPartida("Callaito tete", "HAY QUE LEER ESTE EFECTO, SE ACTIVA UNA VEZ SE TERMINE DE LEER\nEl jugador del turno actual no puede hablar porque está silenciado , si daña a uno o más oponentes , el primer oponente que reciba daño (a héroe o sidekick) pasa a ser el jugador silenciado.\nEl nuevo silenciado debe bajarse el daño una vez se resuelvan los efectos , una vez se haya bajado la vida ya no puede hablar\n Si el silenciado  habla , su héroe recibe daño igual a la cantidad de oponentes vivos");
        ModificadorPartida paloSuave = new ModificadorPartida("Palo suave", "Si un ataque fuese a hacer un valor de daño menor a 4 , se duplica");
        ModificadorPartida laDeLosCampeones = new ModificadorPartida("La de los campeones", "No te puedes mover , no puedes atacar, robas 2 cartas y termina tu turno");
        ModificadorPartida conElPecho = new ModificadorPartida("Con el pecho", "Si el próximo turno te atacan , el primer combate no te puedes defender");
        ModificadorPartida venAqui = new ModificadorPartida("Ven aquí", "Coloca a uno de tus luchadores adyacente al último luchador que te haya hecho daño(si no has recibido daño , al que más ganas tengas d pegarle un palo)");
        ModificadorPartida iono = new ModificadorPartida("Iono", "Elige un oponente (si eres un enemigo del pve , elige al mas cercano , si hay dos con la misma distancia , el que menos vida tenga) , tú y el oponente elegido barajais vuestra mano, la colocais en la parte inferior de la baraja y robais tantas cartas como vida actual (máximo 7 cartas) tenga vuestro héroe con menos vida ");
        ModificadorPartida inInglisPls = new ModificadorPartida("In inglis plis", "ESTE EFECTO HAY QUE LEERLO , SE ACTIVA CUANDO SE TERMINE DE LEER\nEl jugador del turno activo solo puede hablar en " +
                "inglés hasta su próximo turno, si habla en otro idioma que no sea inglés recibe un daño igual a la cantidad de turnos (contando aliados y oponentes) hasta su siguiente turno , " +
                "todos los oponentes vivos le pueden hacer una pregunta por turno");
        ModificadorPartida fueraDiccionario = new ModificadorPartida("A tomar por culo el diccionario", "ESTE EFECTO HAY QUE LEERLO\nEl jugador afectado solo se puede comunicar por onomatopeyas (Si" +
                " hay discusión , preguntad al ChatGPT) hasta que en un combate use una carta con más valor de boosteo que su oponente (si el oponente no se defiende , se considera valor 0), si " +
                "habla con palabras que no sean onomatopeyas , recibe un daño igual a un tercio de la cantidad de cartas que tenga en su pila de descartes redondeando hacia abajo\nEjemplo: Tiene 19" +
                " cartas en la pila de descartes 19/3=6.33 entonces se hace 6 de daño");
        ModificadorPartida aCasa = new ModificadorPartida("A casa", "Tus héroes y sidekick vuelven a su casilla incial , si están ocupadas tu héroe recibe un punto de daño");
        ModificadorPartida aVeLaPilaTio = new ModificadorPartida("A ver la pila tio", "Baraja tu pila de descartes bocabajo, coge la mitad de cartas , colócalas en un montón separado indicando cual es tu pila y cual las separadas, después descarta tantas cartas de tu baraja como cartas tenga el montón separado , coloca el montón en tu baraja , y baraja tu baraja");
        ModificadorPartida kaboom = new ModificadorPartida("KABOOOOOOOM!!!!!", "Elige un valor entre 1 y 5 ,todos(sí, incluido tú) los héroes y sidekicks en la misma zona (si la zona tiene 3 colores ,afecta a los 3) reciben daño igual al valor elegido , si este daño elimina a otro jugador enemigo o enemigo del pve de la partida tienes una acción más ,si este daño te elimina , los oponentes afectados reciben un punto más de daño");
        ModificadorPartida exilio = new ModificadorPartida("Exilio", "Tira un dado de 6 caras y realiza el efecto indicado:\n1 - Exilia una carta de tu mano\n2 - Exilia una carta de tu mano y la primera de tu baraja\n3 - Exilia una carta de tu mano , la primera de la baraja y la última de la pila de descartes(la que no tiene más cartas debajo)\n4 o más - Exilia cualquier combinación de cartas de tu mano , la parte superior de la baraja o parte inferior de la pila de descartes\n\nLas cartas exiliadas no se pueden colocar en la baraja , pila de descartes o mano ni se pueden recuperar de ninguna forma \n(Si eres un villano , descarta la cantidad de cartas que salga en el dado, si antes de terminar sale el engaño , resuelve el efecto del engaño y descarta las restantes )");
        ModificadorPartida copiota = new ModificadorPartida("Copiota", "Elige un jugador, tu pasiva pasa a ser la misma que la de él (Si la pasiva involucra un sidekick , mecánica , nombre de carta , etc propia del personaje a copiar, no se puede copiar)");
        ModificadorPartida elCorsita = new ModificadorPartida("El corsita atropellador", "Si te tienes que mover o te mueves (Si la carta por ejemplo dice muévete un máximo de 5 casillas , o no te mueves o te mueves las 5) , avanza el máximo de casillas que puedas obligatoriamente (no puedes moverte a una casilla que ya hayas pisado este turno) , puedes moverte a través de héroes, sidekicks y ardillas , tú personaje y el atravesado reciben un punto de daño , y puedes colocar al atravesado en una casilla adyacente , si atraviesas a alguien lo puedes colocar en una casilla ocupada haciendole un punto más y desplazando al que ocupaba la casilla \nNO SE PUEDE ATRAVESAR A UN PERSONAJE MÁS DE UNA VEZ");
        ModificadorPartida galletaBluetooth = new ModificadorPartida("Galleta bluetooth", "Elige un oponente y un héroe o sidekick tuyo, la casilla en la que se encuentre el héroe del oponente pasa a tener las mismas zonas que en la que está tu héroe o sidekick, hasta final del primer combate tu personaje elegido se considera a distancia");
        ModificadorPartida momentoDeadPool = new ModificadorPartida("Momento deadpool", "Hasta tu próximo turno eres Deadpool , deja tu mano , mazo y pila de descartes en un montón separado , baraja la baraja de deadpool , descarta tantas cartas como tenías en la pila de descartes y coge tantas cartas como tenías en mano , cuando llegue tu próximo turno, vuelve a tu personaje original, descarta tantas cartas de tu mano como cartas hayas usado siendo deadpool y pon tu vida al valor con el que has terminado de ser deadpool \nSi Deadpool lo tiene otro jugador o no está disponible tu pasiva este turno es que te curas 1 al final de cada combate");
        ModificadorPartida dueloAMuerteConCuchillos = new ModificadorPartida("Esto es personal", "Elige un jugador , apartad las cartas que tengais en mano , seleccionad 4 cartas de la baraja , después se inicia un combate , después del combate , ataca el que se ha defendido y así hasta que uno no pueda atacar o se haya ido con diosito, después de los combates recuperad vuestra mano original y se termina el turno ");
        ModificadorPartida ruletaRusa = new ModificadorPartida("Ruleta rusa", "Elige un oponente , este puede aceptar o rechazar jugar a la ruleta rusa , si acepta tu eliges si jugais con sidekicks o héroes (solo puedes elegir sidekicks si tiene sidekicks vivos) , después de elegir jugais a la ruleta rusa con un D6 , si sale el 6 muere un sideckick o héroe del jugador al que le haya salido dependiendo de que tipo de personaje se ha elegido , si rechaza jugar , tira un D6 y distribuye de la forma que quieras el valor entre recuperar vida a uno de tus personajes y robar \nEJEMPLO: Si sale un 6 en el rechazo , se puede curar 2 al héroe , 1 al sidekick y robar 3");
        ModificadorPartida modificadorSorpresa = new ModificadorPartida("Modificador sorpresa", "Haz otra tirada de modificador después de revelar las cartas del primer combate , si no te has liao a palos con nadie , hazlo a final del turno");
        ModificadorPartida aDosManos = new ModificadorPartida("A dos manos", "En el próximo combate , los dos jugadores podeis usar 2 cartas a la vez , los efectos se acumulan pero teneis que indicar que carta resolveis primero , se considera un solo combate ");
        ModificadorPartida gamblingExtremo = new ModificadorPartida("Gambling extremo", "Si puedes pegar a alguien este turno , debes pegarle , si no debes moverte hasta que puedas pegarle al enemigo más cercano , todo los siguientes valores numéricos se reemplazan por una tirada d6 acciones , valores de pasivas(se realiza la tirada cuando se emplee la pasiva) , robo de cartas y movimiento (si es acción de maniobra se hace en ese orden), valores impresos, valores de boosteo , y valores de efectos \nEN CASO DE COMBATE , EL JUGADOR DEFENSOR TAMBIÉN TIRA EL DADO\nDURANTE ESTE TURNO , EL JUGADOR NO TIENE TAMAÑO DE MANO MÁXIMA");
        ModificadorPartida cartaCounter = new ModificadorPartida("Carta de counter", "El jugador recibe la carta de counter, esta carta le permite cancelar un modificador que reciba cualquier " +
                "jugador (solo lo puede hacer después de que vea el modificador , no lo puede hacer más tarde ), le cancelar una carta de ingenio en el momento que se usa , o cancelarle los efectos" +
                " a una carta en un combate en el que forme parte\nEl jugador al que le cancele el efecto recibe la carta , si usa la carta sobre si mismo , la carta se queda libre\n Si ya tiene " +
                "una carta modificadora , se vuelve a quedar libre y se queda con esta");

        modificadorPartidas.add(hayQueCompartir);
        modificadorPartidas.add(hacerseUnFede);
        modificadorPartidas.add(cambioDeSitio);
        modificadorPartidas.add(peroTuEstasDaltonico);
        modificadorPartidas.add(cartasEnMano);
        modificadorPartidas.add(gambling);
        modificadorPartidas.add(callaitoTete);
        modificadorPartidas.add(paloSuave);
        modificadorPartidas.add(laDeLosCampeones);
        modificadorPartidas.add(conElPecho);
        modificadorPartidas.add(venAqui);
        modificadorPartidas.add(iono);
        modificadorPartidas.add(inInglisPls);
        modificadorPartidas.add(aCasa);
        modificadorPartidas.add(aVeLaPilaTio);
        modificadorPartidas.add(kaboom);
        modificadorPartidas.add(exilio);
        modificadorPartidas.add(copiota);
        modificadorPartidas.add(hayQueCompartir);
        modificadorPartidas.add(elCorsita);
        modificadorPartidas.add(galletaBluetooth);
        modificadorPartidas.add(momentoDeadPool);
        modificadorPartidas.add(dueloAMuerteConCuchillos);
        modificadorPartidas.add(ruletaRusa);
        modificadorPartidas.add(aDosManos);
        modificadorPartidas.add(gamblingExtremo);
        modificadorPartidas.add(fueraDiccionario);
        modificadorPartidas.add(modificadorSorpresa);
        modificadorPartidas.add(cartaCounter);


        ModificadorPartida spTropezon = new ModificadorPartida("Tropezón", "Si estás en combate tu" +
                " personaje se cae y se hace un punto de daño, por vergüenza su carta se vuelve " +
                "una carta de valor impreso 0 sin efectos , y por pena , la de tu oponente pierde" +
                " sus efectos\n\nSi has combatido este turno , te mueves a una casilla adyacente");
        ModificadorPartida spAhoraTeLaLlevas = new ModificadorPartida("Ahora te la llevas por tonto", "Si estás en combate tu oponente te ataca después de este combate (aunque no estes en su rango ," +
                " sus cartas " +
                "tienen 1 más" +
                " de valor impreso\n\nSi no te has pegado con nadie , roba una carta");
        ModificadorPartida spLaDeLosChampions = new ModificadorPartida("La de los Champions", "Si estás en combate una vez leas todo este efecto " +
                "(la parte de si no estás en combate también se lee) solo puedes hablar por señas   \n\nSi no has combatido este turno puedes robar una carta más");
        ModificadorPartida spDeChill = new ModificadorPartida("De chill", "Si estás en combate eso no es muy chill de tu parte , la carta de tu oponente tiene 2 más de valor impreso,\n\nSi no te has pegado con nadie , te curas 2 puntos de vida");

        ModificadorPartida spJackWallside = new ModificadorPartida("Jack Wallside", "Si estás en combate , el defensor se defiende dos más (aunque no use carta) , esto no se considera modificación " +
                "del valor impreso\nSi no estás en combate puedes recuperar tu última carta de defensa que se encuentre en tu pila de descartes(Si no tienes defensas descartadas te jodes , no valen" +
                " versátiles)");

        //Neutro
        ModificadorPartida spPiedraPapelOTijeras = new ModificadorPartida("Piedra , papel o tijeras", "Si estás en combate , juega a piedra papel o tijeras con tu oponente , el que gane elige si " +
                "duplicar todos los valores numéricos de su carta o reducir a la mitad redondeando a la alza los de la carta de su oponente \n\nSi no te has pegado con nadie , juega piedra papel o" +
                " tijeras con un oponente , si pierdes te haces 2 puntos de daño , si ganas puedes curarte 2 puntos de vida o robar 2 cartas");

        //Beneficio ataque
        ModificadorPartida spToroSorpresa = new ModificadorPartida("Toro sorpresa", "Si estás en combate tu carta tiene 7 de valor impreso , 2 de boosteo , y el oponente puede boostear su defensa" +
                ".\n\nSi no te has pegado con nadie , pasas a ser el silenciado (si ya había un silenciado , el que lo era , deja de serlo");
        ModificadorPartida spRonCola = new ModificadorPartida("Ron Cola a las 3AM", "El ron cola te llena de determinación , tus ataques valen 1 más y no se le pueden cancelar los efectos\n\n" +
                "Si no estás en combate , el cubata no te ha sentado muy bien que digamos , te has caido atándote los cordones , te haces un punto de daño , dos si has consumido alcohol en las " +
                "últimas 3 horas");
        ModificadorPartida spEsaNo = new ModificadorPartida("Esa no me gusta", "Si estás en combate , mira la mano de tu rival y cambia la carta que ha usado por otra (Si eres la IA usa la carta de " +
                "valor impreso más bajo), si no tiene más defensas , elige curarte uno de vida o hacerle uno de daño\n\nSi no estás en combate te comes uno de daño");
        ModificadorPartida spEspejitoEspejito = new ModificadorPartida("Espejito Espejito", "Si estás en combate , si la carta del defensor te fuese a hacer daño , el daño lo recibe tu oponente (tu " +
                "no recibes nada)\n\nSi no estás en combate , descarta una carta");
        ModificadorPartida spFintaSorpresa = new ModificadorPartida("Finta sorpresa", "Si estás en" +
                " combate la carta del defensor cancela todos los efectos de tu carta (si no indica que no se pueden cancelar), aparte de mantener los suyos\n\nSi no te has pegado con nadie , te " +
                "curas un punto de vida");


        modificadorSecreto.add(spTropezon);
        modificadorSecreto.add(spFintaSorpresa);
        modificadorSecreto.add(spAhoraTeLaLlevas);
        modificadorSecreto.add(spPiedraPapelOTijeras);
        modificadorSecreto.add(spToroSorpresa);
        modificadorSecreto.add(spRonCola);
        modificadorSecreto.add(spEsaNo);
        modificadorSecreto.add(spEspejitoEspejito);
        modificadorSecreto.add(spDeChill);
        modificadorSecreto.add(spLaDeLosChampions);

    }

    public ArrayList<Personaje> getPersonajesCompleto() {
        return personajes;
    }

    public ArrayList<Mapa> getMapas2Jugadores() {
        return mapas2Jugadores;
    }

    public ArrayList<Mapa> getMapas4Jugadores() {
        return mapas4Jugadores;
    }

    public ArrayList<Personaje> getPersonajes() {
        ArrayList disponibles = new ArrayList();
        for (int i = 0; i < personajes.size(); i++) {
            if (personajes.get(i).isActivo()) {
                disponibles.add(personajes.get(i));
            }
        }
        return disponibles;
    }

    public ArrayList<Personaje> getPersonajesTierS() {
        ArrayList<Personaje> disponibles = new ArrayList<>();
        for (int i = 0; i < personajesTierS.size(); i++) {
            if (personajesTierS.get(i).isActivo()) {
                disponibles.add(personajesTierS.get(i));
            }
        }
        return disponibles;
    }


    public ArrayList<Personaje> getPersonajesTierA() {
        ArrayList<Personaje> disponibles = new ArrayList<>();
        for (int i = 0; i < personajesTierA.size(); i++) {
            if (personajesTierA.get(i).isActivo()) {
                disponibles.add(personajesTierA.get(i));
            }
        }
        return disponibles;
    }

    public ArrayList<Personaje> getPersonajesTierB() {
        ArrayList<Personaje> disponibles = new ArrayList<>();
        for (int i = 0; i < personajesTierB.size(); i++) {
            if (personajesTierB.get(i).isActivo()) {
                disponibles.add(personajesTierB.get(i));
            }
        }
        return disponibles;
    }

    public ArrayList<Personaje> getPersonajesTierC() {
        ArrayList<Personaje> disponibles = new ArrayList<>();
        for (int i = 0; i < personajesTierC.size(); i++) {
            if (personajesTierC.get(i).isActivo()) {
                disponibles.add(personajesTierC.get(i));
            }
        }
        return disponibles;
    }

    public ArrayList<Personaje> getPersonajesTierD() {
        ArrayList<Personaje> disponibles = new ArrayList<>();
        for (int i = 0; i < personajesTierD.size(); i++) {
            if (personajesTierD.get(i).isActivo()) {
                disponibles.add(personajesTierD.get(i));
            }
        }
        return disponibles;
    }

    public ArrayList<Jefe> getJefes() {
        return jefes;
    }

    public ArrayList<Villano> getVillanos() {
        return villanos;
    }

    public ArrayList<Set> getSets() {
        return Sets;
    }

    public ArrayList<ModificadorPartida> getModificadores() {
        ArrayList<ModificadorPartida> disponibles = new ArrayList<>();
        for (int i = 0; i < modificadorPartidas.size(); i++) {
            if (modificadorPartidas.get(i).getActivo()) {
                disponibles.add(modificadorPartidas.get(i));
            }
        }
        return disponibles;
    }

    public ArrayList<ModificadorPartida> getModificadorPartidasCompleto() {
        return modificadorPartidas;
    }

    public ArrayList<ModificadorPartida> getModificadorSecreto() {
        return modificadorSecreto;
    }

    public void testConteo() {
        int cantidadPersonajes = personajes.size();
        int cantidadPersonajesTierS = personajesTierS.size();
        int cantidadPersonajesTierA = personajesTierA.size();
        int cantidadPersonajesTierB = personajesTierB.size();
        int cantidadPersonajesTierC = personajesTierC.size();
        int cantidadPersonajesTierD = personajesTierD.size();
        int cantidadPersonajesTierE = personajesTierE.size();
        int cantidadOtros = 0;


        for (int i = 0; i < personajes.size(); i++) {
            Personaje elegido = personajes.get(i);
            System.out.println(elegido.getNombre());

            switch (elegido.getTier()) {
                case "S":
                    --cantidadPersonajesTierS;
                    break;
                case "A":
                    --cantidadPersonajesTierA;
                    break;
                case "B":
                    --cantidadPersonajesTierB;
                    break;
                case "C":
                    --cantidadPersonajesTierC;
                    break;
                case "D":
                    --cantidadPersonajesTierD;
                    break;
                case "E":
                    --cantidadPersonajesTierE;
                    break;
                default:
                    ++cantidadOtros;
            }
        }

        System.out.println("Tier S :"+ cantidadPersonajesTierS );
        System.out.println("Tier A :"+ cantidadPersonajesTierA );
        System.out.println("Tier B :"+ cantidadPersonajesTierB );
        System.out.println("Tier C :"+ cantidadPersonajesTierC );
        System.out.println("Tier D :"+ cantidadPersonajesTierD );
        System.out.println("Tier E :"+ cantidadPersonajesTierE );
        System.out.println("Tier X :"+ cantidadOtros );
        System.out.println("TOTAL: " + personajes.size() );

    }
}
