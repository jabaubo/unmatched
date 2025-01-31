package proyecto.unmatched;

import java.util.ArrayList;

public class Controlador {
    ArrayList<Mapa> mapas2Jugadores = new ArrayList<Mapa>();
    ArrayList<Mapa> mapas4Jugadores = new ArrayList<Mapa>();
    ArrayList<Personaje> personajes = new ArrayList<>();
    ArrayList<Personaje> personajesTierS = new ArrayList<>();
    ArrayList<Personaje> personajesTierA = new ArrayList<>();
    ArrayList<Personaje> personajesTierB = new ArrayList<>();
    ArrayList<Personaje> personajesTierC = new ArrayList<>();
    ArrayList<Personaje> personajesTierD = new ArrayList<>();

    ArrayList<Villano> villanos = new ArrayList<>();
    ArrayList<Jefe> jefes = new ArrayList<>();


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

        personajes.add(elektra);
        personajes.add(goldenBat);
        personajes.add(nikolaTesla);
        personajes.add(sherlockHolmes);
        personajes.add(yennenga);
        personajes.add(medusa);

        personajesTierS.add(elektra);
        personajesTierS.add(goldenBat);
        personajesTierS.add(nikolaTesla);
        personajesTierS.add(sherlockHolmes);
        personajesTierS.add(yennenga);
        personajesTierS.add(medusa);


        // Tier A
        Personaje aquiles = new Personaje("Aquiles", "A");
        Personaje drJillTrent = new Personaje("Dr. Jill Trent", "A");
        Personaje houdini = new Personaje("Houdini", "A");
        Personaje littleRedRidingHood = new Personaje("Caperucita Roja", "A");
        Personaje lukeCage = new Personaje("Luke Cage", "A");
        Personaje moonKnight = new Personaje("Moon Knight", "A");
        Personaje sunWukong = new Personaje("Sun Wukong", "A");
        Personaje sinbad = new Personaje("Sinbad", "A");


        personajes.add(aquiles);
        personajes.add(drJillTrent);
        personajes.add(houdini);
        personajes.add(littleRedRidingHood);
        personajes.add(lukeCage);
        personajes.add(moonKnight);
        personajes.add(sunWukong);
        personajes.add(sinbad);

        personajesTierA.add(aquiles);
        personajesTierA.add(drJillTrent);
        personajesTierA.add(houdini);
        personajesTierA.add(littleRedRidingHood);
        personajesTierA.add(lukeCage);
        personajesTierA.add(moonKnight);
        personajesTierA.add(sunWukong);
        personajesTierA.add(sinbad);


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


        personajes.add(daredevil);
        personajes.add(dracula);
        personajes.add(ghostRider);
        personajes.add(tRex);
        personajes.add(theGenie);
        personajes.add(tomoeGozen);
        personajes.add(blackWidow);
        personajes.add(winterSoldier);
        personajes.add(titania);

        personajesTierB.add(daredevil);
        personajesTierB.add(dracula);
        personajesTierB.add(ghostRider);
        personajesTierB.add(tRex);
        personajesTierB.add(theGenie);
        personajesTierB.add(tomoeGozen);
        personajesTierB.add(blackWidow);
        personajesTierB.add(winterSoldier);
        personajesTierB.add(titania);
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



        // Tier D
        Personaje invisibleMan = new Personaje("El Hombre Invisible", "D");
        Personaje jekyllHyde = new Personaje("Jekyll & Hyde", "D");
        Personaje odaNobunaga = new Personaje("Oda Nobunaga", "D");
        Personaje cloakYDagger = new Personaje("Cloak y Dagger", "D");
        Personaje reyArturo = new Personaje("Rey Arturo", "D");
        Personaje hamlet = new Personaje("Hamlet", "D");


        personajes.add(invisibleMan);
        personajes.add(jekyllHyde);
        personajes.add(odaNobunaga);
        personajes.add(cloakYDagger);
        personajes.add(reyArturo);
        personajes.add(hamlet);

        personajesTierD.add(invisibleMan);
        personajesTierD.add(jekyllHyde);
        personajesTierD.add(odaNobunaga);
        personajesTierD.add(cloakYDagger);
        personajesTierD.add(reyArturo);
        personajesTierD.add(hamlet);

        //Tier F
        Personaje squirrelGirl = new Personaje("Squirrel Girl", "F");
        personajes.add(squirrelGirl);

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
            if (personajes.get(i).isActivo()){
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
}
