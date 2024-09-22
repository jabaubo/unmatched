package proyecto.unmatched;

import java.util.ArrayList;

public class Controlador {
    ArrayList<Personaje> personajes = new ArrayList<>();
    ArrayList<Personaje> personajesTierS = new ArrayList<>();
    ArrayList<Personaje> personajesTierA = new ArrayList<>();
    ArrayList<Personaje> personajesTierB = new ArrayList<>();
    ArrayList<Personaje> personajesTierC = new ArrayList<>();
    ArrayList<Personaje> personajesTierD = new ArrayList<>();


    public Controlador() {
        // Tier S
        Personaje elektra = new Personaje("Elektra", "S");
        Personaje goldenBat = new Personaje("Golden Bat", "S");
        Personaje nikolaTesla = new Personaje("Nikola Tesla", "S");
        Personaje sherlockHolmes = new Personaje("Sherlock Holmes", "S");
        Personaje yennenga = new Personaje("Yennenga", "S");

        personajes.add(elektra);
        personajes.add(goldenBat);
        personajes.add(nikolaTesla);
        personajes.add(sherlockHolmes);
        personajes.add(yennenga);

        personajesTierS.add(elektra);
        personajesTierS.add(goldenBat);
        personajesTierS.add(nikolaTesla);
        personajesTierS.add(sherlockHolmes);
        personajesTierS.add(yennenga);

        // Tier A
        Personaje aquiles = new Personaje("Aquiles", "A");
        Personaje drJillTrent = new Personaje("Dr. Jill Trent", "A");
        Personaje houdini = new Personaje("Houdini", "A");
        Personaje littleRedRidingHood = new Personaje("Caperucita Roja", "A");
        Personaje lukeCage = new Personaje("Luke Cage", "A");
        Personaje moonKnight = new Personaje("Moon Knight", "A");
        Personaje sunWukong = new Personaje("Sun Wukong", "A");

        personajes.add(aquiles);
        personajes.add(drJillTrent);
        personajes.add(houdini);
        personajes.add(littleRedRidingHood);
        personajes.add(lukeCage);
        personajes.add(moonKnight);
        personajes.add(sunWukong);

        personajesTierA.add(aquiles);
        personajesTierA.add(drJillTrent);
        personajesTierA.add(houdini);
        personajesTierA.add(littleRedRidingHood);
        personajesTierA.add(lukeCage);
        personajesTierA.add(moonKnight);
        personajesTierA.add(sunWukong);

        // Tier B
        Personaje daredevil = new Personaje("Daredevil", "B");
        Personaje dracula = new Personaje("Drácula", "B");
        Personaje ghostRider = new Personaje("Ghost Rider", "B");
        Personaje tRex = new Personaje("T. Rex", "B");
        Personaje theGenie = new Personaje("The Genie", "B");
        Personaje tomoeGozen = new Personaje("Tomoe Gozen", "B");

        personajes.add(daredevil);
        personajes.add(dracula);
        personajes.add(ghostRider);
        personajes.add(tRex);
        personajes.add(theGenie);
        personajes.add(tomoeGozen);

        personajesTierB.add(daredevil);
        personajesTierB.add(dracula);
        personajesTierB.add(ghostRider);
        personajesTierB.add(tRex);
        personajesTierB.add(theGenie);
        personajesTierB.add(tomoeGozen);

        // Tier C
        Personaje annieChristmas = new Personaje("Annie Christmas", "C");
        Personaje beowulf = new Personaje("Beowulf", "C");
        Personaje bloodyMary = new Personaje("Bloody Mary", "C");
        Personaje bullseye = new Personaje("Bullseye", "C");
        Personaje drEllieSattler = new Personaje("Dr. Ellie Sattler", "C");


        personajes.add(annieChristmas);
        personajes.add(beowulf);
        personajes.add(bloodyMary);
        personajes.add(bullseye);
        personajes.add(drEllieSattler);

        personajesTierC.add(annieChristmas);
        personajesTierC.add(beowulf);
        personajesTierC.add(bloodyMary);
        personajesTierC.add(bullseye);
        personajesTierC.add(drEllieSattler);


        // Tier D
        Personaje invisibleMan = new Personaje("El Hombre Invisible", "D");
        Personaje jekyllHyde = new Personaje("Jekyll & Hyde", "D");
        Personaje odaNobunaga = new Personaje("Oda Nobunaga", "D");

        personajes.add(invisibleMan);
        personajes.add(jekyllHyde);
        personajes.add(odaNobunaga);

        personajesTierD.add(invisibleMan);
        personajesTierD.add(jekyllHyde);
        personajesTierD.add(odaNobunaga);

    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public ArrayList<Personaje> getPersonajesTierS() {
        return personajesTierS;
    }

    public ArrayList<Personaje> getPersonajesTierA() {
        return personajesTierA;
    }

    public ArrayList<Personaje> getPersonajesTierB() {
        return personajesTierB;
    }

    public ArrayList<Personaje> getPersonajesTierC() {
        return personajesTierC;
    }

    public ArrayList<Personaje> getPersonajesTierD() {
        return personajesTierD;
    }
}
