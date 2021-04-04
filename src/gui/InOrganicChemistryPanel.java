package gui;

import listeners.BackListener;
import listeners.PeriodicTableListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InOrganicChemistryPanel extends JPanel implements ActionListener {

    private final JButton back;
    private final JButton hydrogen;
    private final JButton helium;
    private final JButton lithium;
    private final JButton beryllium;
    private final JButton boron;
    private final JButton carbon;
    private final JButton nitrogen;
    private final JButton oxygen;
    private final JButton fluorine;
    private final JButton neon;
    private final JButton sodium;
    private final JButton magnesium;
    private final JButton aluminium;
    private final JButton silicon;
    private final JButton phosphorus;
    private final JButton sulfur;
    private final JButton chlorine;
    private final JButton argon;
    private final JButton potassium;
    private final JButton calcium;
    private final JButton scandium;
    private final JButton titanium;
    private final JButton vanadium;
    private final JButton chromium;
    private final JButton manganese;
    private final JButton iron;
    private final JButton cobalt;
    private final JButton nickel;
    private final JButton copper;
    private final JButton zinc;
    private final JButton gallium;
    private final JButton germanium;
    private final JButton arsenic;
    private final JButton selenium;
    private final JButton bromine;
    private final JButton krypton;
    private final JButton rubidium;
    private final JButton strontium;
    private final JButton yttrium;
    private final JButton zirconium;
    private final JButton niobium;
    private final JButton molybdenum;
    private final JButton technetium;
    private final JButton ruthenium;
    private final JButton rhodium;
    private final JButton palladium;
    private final JButton silver;
    private final JButton cadmium;
    private final JButton indium;
    private final JButton tin;
    private final JButton antimony;
    private final JButton tellurium;
    private final JButton iodine;
    private final JButton xenon;
    private final JButton caesium;
    private final JButton barium;
    private final JButton lanthanum;
    private final JButton cerium;
    private final JButton praseodymium;
    private final JButton neodymium;
    private final JButton promethium;
    private final JButton samarium;
    private final JButton europium;
    private final JButton gadolinium;
    private final JButton terbium;
    private final JButton dysprosium;
    private final JButton holmium;
    private final JButton erbium;
    private final JButton thulium;
    private final JButton ytterbium;
    private final JButton lutetium;
    private final JButton hafnium;
    private final JButton tantalum;
    private final JButton tungsten;
    private final JButton rhenium;
    private final JButton osmium;
    private final JButton iridium;
    private final JButton platinum;
    private final JButton gold;
    private final JButton mercury;
    private final JButton thallium;
    private final JButton lead;
    private final JButton bismuth;
    private final JButton polonium;
    private final JButton astatine;
    private final JButton radon;
    private final JButton francium;
    private final JButton radium;
    private final JButton actinium;
    private final JButton thorium;
    private final JButton protactinium;
    private final JButton uranium;
    private final JButton neptunium;
    private final JButton plutonium;
    private final JButton americium;
    private final JButton curium;
    private final JButton berkelium;
    private final JButton californium;
    private final JButton einsteinium;
    private final JButton fermium;
    private final JButton mendelevium;
    private final JButton nobelium;
    private final JButton lawrencium;
    private final JButton rutherfordium;
    private final JButton dubnium;
    private final JButton seaborgium;
    private final JButton bohrium;
    private final JButton hassium;
    private final JButton meitnerium;
    private final JButton darmstadtium;
    private final JButton roentgenium;
    private final JButton copernicium;
    private final JButton nihonium;
    private final JButton flerovium;
    private final JButton moscovium;
    private final JButton livermorium;
    private final JButton tennessine;
    private final JButton oganesson;
    private PeriodicTableListener periodicTableListener;
    private BackListener backListener;

    public InOrganicChemistryPanel() {
        hydrogen = new JButton("H");
        hydrogen.setBackground(new Color(243, 229, 245));
        hydrogen.setFont(new Font("Open Sans", Font.BOLD, 16));
        helium = new JButton("He");
        helium.setBackground(new Color(171, 71, 188));
        helium.setFont(new Font("Open Sans", Font.BOLD, 16));
        lithium = new JButton("Li");
        lithium.setBackground(new Color(255, 167, 38));
        lithium.setFont(new Font("Open Sans", Font.BOLD, 16));
        beryllium = new JButton("Be");
        beryllium.setBackground(new Color(255, 204, 128));
        beryllium.setFont(new Font("Open Sans", Font.BOLD, 16));
        boron = new JButton("B");
        boron.setBackground(new Color(129, 212, 250));
        boron.setFont(new Font("Open Sans", Font.BOLD, 16));
        carbon = new JButton("C");
        carbon.setBackground(new Color(243, 229, 245));
        carbon.setFont(new Font("Open Sans", Font.BOLD, 16));
        nitrogen = new JButton("N");
        nitrogen.setBackground(new Color(243, 229, 245));
        nitrogen.setFont(new Font("Open Sans", Font.BOLD, 16));
        oxygen = new JButton("O");
        oxygen.setBackground(new Color(243, 229, 245));
        oxygen.setFont(new Font("Open Sans", Font.BOLD, 16));
        fluorine = new JButton("F");
        fluorine.setBackground(new Color(206, 147, 216));
        fluorine.setFont(new Font("Open Sans", Font.BOLD, 16));
        neon = new JButton("Ne");
        neon.setBackground(new Color(171, 71, 188));
        neon.setFont(new Font("Open Sans", Font.BOLD, 16));
        sodium = new JButton("Na");
        sodium.setBackground(new Color(255, 167, 38));
        sodium.setFont(new Font("Open Sans", Font.BOLD, 16));
        magnesium = new JButton("Mg");
        magnesium.setBackground(new Color(255, 204, 128));
        magnesium.setFont(new Font("Open Sans", Font.BOLD, 16));
        aluminium = new JButton("Al");
        aluminium.setBackground(new Color(178, 255, 89));
        aluminium.setFont(new Font("Open Sans", Font.BOLD, 16));
        silicon = new JButton("Si");
        silicon.setBackground(new Color(129, 212, 250));
        silicon.setFont(new Font("Open Sans", Font.BOLD, 16));
        phosphorus = new JButton("P");
        phosphorus.setBackground(new Color(243, 229, 245));
        phosphorus.setFont(new Font("Open Sans", Font.BOLD, 16));
        sulfur = new JButton("S");
        sulfur.setBackground(new Color(243, 229, 245));
        sulfur.setFont(new Font("Open Sans", Font.BOLD, 16));
        chlorine = new JButton("Cl");
        chlorine.setBackground(new Color(206, 147, 216));
        chlorine.setFont(new Font("Open Sans", Font.BOLD, 16));
        argon = new JButton("Ar");
        argon.setBackground(new Color(171, 71, 188));
        argon.setFont(new Font("Open Sans", Font.BOLD, 16));
        potassium = new JButton("K");
        potassium.setBackground(new Color(255, 167, 38));
        potassium.setFont(new Font("Open Sans", Font.BOLD, 16));
        calcium = new JButton("Ca");
        calcium.setBackground(new Color(255, 204, 128));
        calcium.setFont(new Font("Open Sans", Font.BOLD, 16));
        scandium = new JButton("Sc");
        scandium.setBackground(new Color(255, 255, 0));
        scandium.setFont(new Font("Open Sans", Font.BOLD, 16));
        titanium = new JButton("Ti");
        titanium.setBackground(new Color(255, 255, 0));
        titanium.setFont(new Font("Open Sans", Font.BOLD, 16));
        vanadium = new JButton("V");
        vanadium.setBackground(new Color(255, 255, 0));
        vanadium.setFont(new Font("Open Sans", Font.BOLD, 16));
        chromium = new JButton("Cr");
        chromium.setBackground(new Color(255, 255, 0));
        chromium.setFont(new Font("Open Sans", Font.BOLD, 16));
        manganese = new JButton("Mn");
        manganese.setBackground(new Color(255, 255, 0));
        manganese.setFont(new Font("Open Sans", Font.BOLD, 16));
        iron = new JButton("Fe");
        iron.setBackground(new Color(255, 255, 0));
        iron.setFont(new Font("Open Sans", Font.BOLD, 16));
        cobalt = new JButton("Co");
        cobalt.setBackground(new Color(255, 255, 0));
        cobalt.setFont(new Font("Open Sans", Font.BOLD, 16));
        nickel = new JButton("Ni");
        nickel.setBackground(new Color(255, 255, 0));
        nickel.setFont(new Font("Open Sans", Font.BOLD, 16));
        copper = new JButton("Cu");
        copper.setBackground(new Color(255, 255, 0));
        copper.setFont(new Font("Open Sans", Font.BOLD, 16));
        zinc = new JButton("Zn");
        zinc.setBackground(new Color(255, 255, 0));
        zinc.setFont(new Font("Open Sans", Font.BOLD, 16));
        gallium = new JButton("Ga");
        gallium.setBackground(new Color(178, 255, 89));
        gallium.setFont(new Font("Open Sans", Font.BOLD, 16));
        germanium = new JButton("Ge");
        germanium.setBackground(new Color(129, 212, 250));
        germanium.setFont(new Font("Open Sans", Font.BOLD, 16));
        arsenic = new JButton("As");
        arsenic.setBackground(new Color(129, 212, 250));
        arsenic.setFont(new Font("Open Sans", Font.BOLD, 16));
        selenium = new JButton("Se");
        selenium.setBackground(new Color(243, 229, 245));
        selenium.setFont(new Font("Open Sans", Font.BOLD, 16));
        bromine = new JButton("Br");
        bromine.setBackground(new Color(206, 147, 216));
        bromine.setFont(new Font("Open Sans", Font.BOLD, 16));
        krypton = new JButton("Kr");
        krypton.setBackground(new Color(171, 71, 188));
        krypton.setFont(new Font("Open Sans", Font.BOLD, 16));
        rubidium = new JButton("Rb");
        rubidium.setBackground(new Color(255, 167, 38));
        rubidium.setFont(new Font("Open Sans", Font.BOLD, 16));
        strontium = new JButton("Sr");
        strontium.setBackground(new Color(255, 204, 128));
        strontium.setFont(new Font("Open Sans", Font.BOLD, 16));
        yttrium = new JButton("Y");
        yttrium.setBackground(new Color(255, 255, 0));
        yttrium.setFont(new Font("Open Sans", Font.BOLD, 16));
        zirconium = new JButton("Zr");
        zirconium.setBackground(new Color(255, 255, 0));
        zirconium.setFont(new Font("Open Sans", Font.BOLD, 16));
        niobium = new JButton("Nb");
        niobium.setBackground(new Color(255, 255, 0));
        niobium.setFont(new Font("Open Sans", Font.BOLD, 16));
        molybdenum = new JButton("Mo");
        molybdenum.setBackground(new Color(255, 255, 0));
        molybdenum.setFont(new Font("Open Sans", Font.BOLD, 16));
        technetium = new JButton("Tc");
        technetium.setBackground(new Color(255, 255, 0));
        technetium.setFont(new Font("Open Sans", Font.BOLD, 16));
        ruthenium = new JButton("Ru");
        ruthenium.setBackground(new Color(255, 255, 0));
        ruthenium.setFont(new Font("Open Sans", Font.BOLD, 16));
        rhodium = new JButton("Rh");
        rhodium.setBackground(new Color(255, 255, 0));
        rhodium.setFont(new Font("Open Sans", Font.BOLD, 16));
        palladium = new JButton("Pd");
        palladium.setBackground(new Color(255, 255, 0));
        palladium.setFont(new Font("Open Sans", Font.BOLD, 16));
        silver = new JButton("Ag");
        silver.setBackground(new Color(255, 255, 0));
        silver.setFont(new Font("Open Sans", Font.BOLD, 16));
        cadmium = new JButton("Cd");
        cadmium.setBackground(new Color(255, 255, 0));
        cadmium.setFont(new Font("Open Sans", Font.BOLD, 16));
        indium = new JButton("In");
        indium.setBackground(new Color(178, 255, 89));
        indium.setFont(new Font("Open Sans", Font.BOLD, 16));
        tin = new JButton("Sn");
        tin.setBackground(new Color(178, 255, 89));
        tin.setFont(new Font("Open Sans", Font.BOLD, 16));
        antimony = new JButton("Sb");
        antimony.setBackground(new Color(129, 212, 250));
        antimony.setFont(new Font("Open Sans", Font.BOLD, 16));
        tellurium = new JButton("Te");
        tellurium.setBackground(new Color(129, 212, 250));
        tellurium.setFont(new Font("Open Sans", Font.BOLD, 16));
        iodine = new JButton("I");
        iodine.setBackground(new Color(206, 147, 216));
        iodine.setFont(new Font("Open Sans", Font.BOLD, 16));
        xenon = new JButton("Xe");
        xenon.setBackground(new Color(171, 71, 188));
        xenon.setFont(new Font("Open Sans", Font.BOLD, 16));
        caesium = new JButton("Cs");
        caesium.setBackground(new Color(255, 167, 38));
        caesium.setFont(new Font("Open Sans", Font.BOLD, 16));
        barium = new JButton("Ba");
        barium.setBackground(new Color(255, 204, 128));
        barium.setFont(new Font("Open Sans", Font.BOLD, 16));
        lanthanum = new JButton("La");
        lanthanum.setBackground(new Color(244, 143, 177));
        lanthanum.setFont(new Font("Open Sans", Font.BOLD, 16));
        cerium = new JButton("Ce");
        cerium.setBackground(new Color(244, 143, 177));
        cerium.setFont(new Font("Open Sans", Font.BOLD, 16));
        praseodymium = new JButton("Pr");
        praseodymium.setBackground(new Color(244, 143, 177));
        praseodymium.setFont(new Font("Open Sans", Font.BOLD, 16));
        neodymium = new JButton("Nd");
        neodymium.setBackground(new Color(244, 143, 177));
        neodymium.setFont(new Font("Open Sans", Font.BOLD, 16));
        promethium = new JButton("Pm");
        promethium.setBackground(new Color(244, 143, 177));
        promethium.setFont(new Font("Open Sans", Font.BOLD, 16));
        samarium = new JButton("Sm");
        samarium.setBackground(new Color(244, 143, 177));
        samarium.setFont(new Font("Open Sans", Font.BOLD, 16));
        europium = new JButton("Eu");
        europium.setBackground(new Color(244, 143, 177));
        europium.setFont(new Font("Open Sans", Font.BOLD, 16));
        gadolinium = new JButton("Gd");
        gadolinium.setBackground(new Color(244, 143, 177));
        gadolinium.setFont(new Font("Open Sans", Font.BOLD, 16));
        terbium = new JButton("Tb");
        terbium.setBackground(new Color(244, 143, 177));
        terbium.setFont(new Font("Open Sans", Font.BOLD, 16));
        dysprosium = new JButton("Dy");
        dysprosium.setBackground(new Color(244, 143, 177));
        dysprosium.setFont(new Font("Open Sans", Font.BOLD, 16));
        holmium = new JButton("Ho");
        holmium.setBackground(new Color(244, 143, 177));
        holmium.setFont(new Font("Open Sans", Font.BOLD, 16));
        erbium = new JButton("Er");
        erbium.setBackground(new Color(244, 143, 177));
        erbium.setFont(new Font("Open Sans", Font.BOLD, 16));
        thulium = new JButton("Tm");
        thulium.setBackground(new Color(244, 143, 177));
        thulium.setFont(new Font("Open Sans", Font.BOLD, 16));
        ytterbium = new JButton("Yb");
        ytterbium.setBackground(new Color(244, 143, 177));
        ytterbium.setFont(new Font("Open Sans", Font.BOLD, 16));
        lutetium = new JButton("Lu");
        lutetium.setBackground(new Color(244, 143, 177));
        lutetium.setFont(new Font("Open Sans", Font.BOLD, 16));
        hafnium = new JButton("Hf");
        hafnium.setBackground(new Color(255, 255, 0));
        hafnium.setFont(new Font("Open Sans", Font.BOLD, 16));
        tantalum = new JButton("Ta");
        tantalum.setBackground(new Color(255, 255, 0));
        tantalum.setFont(new Font("Open Sans", Font.BOLD, 16));
        tungsten = new JButton("W");
        tungsten.setBackground(new Color(255, 255, 0));
        tungsten.setFont(new Font("Open Sans", Font.BOLD, 16));
        rhenium = new JButton("Re");
        rhenium.setBackground(new Color(255, 255, 0));
        rhenium.setFont(new Font("Open Sans", Font.BOLD, 16));
        osmium = new JButton("Os");
        osmium.setBackground(new Color(255, 255, 0));
        osmium.setFont(new Font("Open Sans", Font.BOLD, 16));
        iridium = new JButton("Ir");
        iridium.setBackground(new Color(255, 255, 0));
        iridium.setFont(new Font("Open Sans", Font.BOLD, 16));
        platinum = new JButton("Pt");
        platinum.setBackground(new Color(255, 255, 0));
        platinum.setFont(new Font("Open Sans", Font.BOLD, 16));
        gold = new JButton("Au");
        gold.setBackground(new Color(255, 255, 0));
        gold.setFont(new Font("Open Sans", Font.BOLD, 16));
        mercury = new JButton("Hg");
        mercury.setBackground(new Color(255, 255, 0));
        mercury.setFont(new Font("Open Sans", Font.BOLD, 16));
        thallium = new JButton("Tl");
        thallium.setBackground(new Color(178, 255, 89));
        thallium.setFont(new Font("Open Sans", Font.BOLD, 16));
        lead = new JButton("Pb");
        lead.setBackground(new Color(178, 255, 89));
        lead.setFont(new Font("Open Sans", Font.BOLD, 16));
        bismuth = new JButton("Bi");
        bismuth.setBackground(new Color(178, 255, 89));
        bismuth.setFont(new Font("Open Sans", Font.BOLD, 16));
        polonium = new JButton("Po");
        polonium.setBackground(new Color(129, 212, 250));
        polonium.setFont(new Font("Open Sans", Font.BOLD, 16));
        astatine = new JButton("At");
        astatine.setBackground(new Color(206, 147, 216));
        astatine.setFont(new Font("Open Sans", Font.BOLD, 16));
        radon = new JButton("Rn");
        radon.setBackground(new Color(171, 71, 188));
        radon.setFont(new Font("Open Sans", Font.BOLD, 16));
        francium = new JButton("Fr");
        francium.setBackground(new Color(255, 167, 38));
        francium.setFont(new Font("Open Sans", Font.BOLD, 16));
        radium = new JButton("Ra");
        radium.setBackground(new Color(255, 204, 128));
        radium.setFont(new Font("Open Sans", Font.BOLD, 16));
        actinium = new JButton("Ac");
        actinium.setBackground(new Color(236, 64, 122));
        actinium.setFont(new Font("Open Sans", Font.BOLD, 16));
        thorium = new JButton("Th");
        thorium.setBackground(new Color(236, 64, 122));
        thorium.setFont(new Font("Open Sans", Font.BOLD, 16));
        protactinium = new JButton("Pa");
        protactinium.setBackground(new Color(236, 64, 122));
        protactinium.setFont(new Font("Open Sans", Font.BOLD, 16));
        uranium = new JButton("U");
        uranium.setBackground(new Color(236, 64, 122));
        uranium.setFont(new Font("Open Sans", Font.BOLD, 16));
        neptunium = new JButton("Np");
        neptunium.setBackground(new Color(236, 64, 122));
        neptunium.setFont(new Font("Open Sans", Font.BOLD, 16));
        plutonium = new JButton("Pu");
        plutonium.setBackground(new Color(236, 64, 122));
        plutonium.setFont(new Font("Open Sans", Font.BOLD, 16));
        americium = new JButton("Am");
        americium.setBackground(new Color(236, 64, 122));
        americium.setFont(new Font("Open Sans", Font.BOLD, 16));
        curium = new JButton("Cm");
        curium.setBackground(new Color(236, 64, 122));
        curium.setFont(new Font("Open Sans", Font.BOLD, 16));
        berkelium = new JButton("Bk");
        berkelium.setBackground(new Color(236, 64, 122));
        berkelium.setFont(new Font("Open Sans", Font.BOLD, 16));
        californium = new JButton("Cf");
        californium.setBackground(new Color(236, 64, 122));
        californium.setFont(new Font("Open Sans", Font.BOLD, 16));
        einsteinium = new JButton("Es");
        einsteinium.setBackground(new Color(236, 64, 122));
        einsteinium.setFont(new Font("Open Sans", Font.BOLD, 16));
        fermium = new JButton("Fm");
        fermium.setBackground(new Color(236, 64, 122));
        fermium.setFont(new Font("Open Sans", Font.BOLD, 16));
        mendelevium = new JButton("Md");
        mendelevium.setBackground(new Color(236, 64, 122));
        mendelevium.setFont(new Font("Open Sans", Font.BOLD, 16));
        nobelium = new JButton("No");
        nobelium.setBackground(new Color(236, 64, 122));
        nobelium.setFont(new Font("Open Sans", Font.BOLD, 16));
        lawrencium = new JButton("Lr");
        lawrencium.setBackground(new Color(236, 64, 122));
        lawrencium.setFont(new Font("Open Sans", Font.BOLD, 16));
        rutherfordium = new JButton("Rf");
        rutherfordium.setBackground(new Color(255, 255, 0));
        rutherfordium.setFont(new Font("Open Sans", Font.BOLD, 16));
        dubnium = new JButton("Db");
        dubnium.setBackground(new Color(255, 255, 0));
        dubnium.setFont(new Font("Open Sans", Font.BOLD, 16));
        seaborgium = new JButton("Sg");
        seaborgium.setBackground(new Color(255, 255, 0));
        seaborgium.setFont(new Font("Open Sans", Font.BOLD, 16));
        bohrium = new JButton("Bh");
        bohrium.setBackground(new Color(255, 255, 0));
        bohrium.setFont(new Font("Open Sans", Font.BOLD, 16));
        hassium = new JButton("Hs");
        hassium.setBackground(new Color(255, 255, 0));
        hassium.setFont(new Font("Open Sans", Font.BOLD, 16));
        meitnerium = new JButton("Mt");
        meitnerium.setBackground(new Color(255, 255, 0));
        meitnerium.setFont(new Font("Open Sans", Font.BOLD, 16));
        darmstadtium = new JButton("Ds");
        darmstadtium.setBackground(new Color(255, 255, 0));
        darmstadtium.setFont(new Font("Open Sans", Font.BOLD, 16));
        roentgenium = new JButton("Rg");
        roentgenium.setBackground(new Color(255, 255, 0));
        roentgenium.setFont(new Font("Open Sans", Font.BOLD, 16));
        copernicium = new JButton("Cn");
        copernicium.setBackground(new Color(255, 255, 0));
        copernicium.setFont(new Font("Open Sans", Font.BOLD, 16));
        nihonium = new JButton("Nh");
        nihonium.setBackground(new Color(178, 255, 89));
        nihonium.setFont(new Font("Open Sans", Font.BOLD, 16));
        flerovium = new JButton("Fl");
        flerovium.setBackground(new Color(178, 255, 89));
        flerovium.setFont(new Font("Open Sans", Font.BOLD, 16));
        moscovium = new JButton("Mc");
        moscovium.setBackground(new Color(178, 255, 89));
        moscovium.setFont(new Font("Open Sans", Font.BOLD, 16));
        livermorium = new JButton("Lv");
        livermorium.setBackground(new Color(178, 255, 89));
        livermorium.setFont(new Font("Open Sans", Font.BOLD, 16));
        tennessine = new JButton("Ts");
        tennessine.setBackground(new Color(206, 147, 216));
        tennessine.setFont(new Font("Open Sans", Font.BOLD, 16));
        oganesson = new JButton("Og");
        oganesson.setBackground(new Color(171, 71, 188));
        oganesson.setFont(new Font("Open Sans", Font.BOLD, 16));

        back = new JButton("Back");
        back.addActionListener(this);

        setLayoutComponents();
    }

    private void setLayoutComponents() {

        Border innerBorder = BorderFactory.createTitledBorder("Periodic Table");
        Border outerBorder = BorderFactory.createEmptyBorder(15, 15, 15, 15);

        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        Dimension dimension = new Dimension(60, 60);

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;

        // Hydrogen

        hydrogen.setPreferredSize(dimension);
        hydrogen.addActionListener(this);
        add(hydrogen, gc);

        // Helium

        gc.gridx = 17;
        helium.setPreferredSize(dimension);
        helium.addActionListener(this);
        add(helium, gc);


        gc.gridx = 0;
        gc.gridy++;

        // Lithium

        lithium.setPreferredSize(dimension);
        lithium.addActionListener(this);
        add(lithium, gc);

        //Beryllium
        gc.gridx++;
        beryllium.setPreferredSize(dimension);
        beryllium.addActionListener(this);
        add(beryllium, gc);

        //Boron
        gc.gridx = 12;
        boron.setPreferredSize(dimension);
        boron.addActionListener(this);
        add(boron, gc);

        //Carbon
        gc.gridx++;
        carbon.setPreferredSize(dimension);
        carbon.addActionListener(this);
        add(carbon, gc);

        //Nitrogen
        gc.gridx++;
        nitrogen.setPreferredSize(dimension);
        nitrogen.addActionListener(this);
        add(nitrogen, gc);

        //Oxygen
        gc.gridx++;
        oxygen.setPreferredSize(dimension);
        oxygen.addActionListener(this);
        add(oxygen, gc);

        //Fluorine
        gc.gridx++;
        fluorine.setPreferredSize(dimension);
        fluorine.addActionListener(this);
        add(fluorine, gc);

        //Neon
        gc.gridx++;
        neon.setPreferredSize(dimension);
        neon.addActionListener(this);
        add(neon, gc);


        gc.gridx = 0;
        gc.gridy++;

        //Sodium
        sodium.setPreferredSize(dimension);
        sodium.addActionListener(this);
        add(sodium, gc);

        //Magnesium
        gc.gridx++;
        magnesium.setPreferredSize(dimension);
        magnesium.addActionListener(this);
        add(magnesium, gc);

        //Aluminium
        gc.gridx = 12;
        aluminium.setPreferredSize(dimension);
        aluminium.addActionListener(this);
        add(aluminium, gc);

        //Silicon
        gc.gridx++;
        silicon.setPreferredSize(dimension);
        silicon.addActionListener(this);
        add(silicon, gc);

        //Phosphorus
        gc.gridx++;
        phosphorus.setPreferredSize(dimension);
        phosphorus.addActionListener(this);
        add(phosphorus, gc);

        //Sulfur
        gc.gridx++;
        sulfur.setPreferredSize(dimension);
        sulfur.addActionListener(this);
        add(sulfur, gc);

        //Chlorine
        gc.gridx++;
        chlorine.setPreferredSize(dimension);
        chlorine.addActionListener(this);
        add(chlorine, gc);

        //Argon
        gc.gridx++;
        argon.setPreferredSize(dimension);
        argon.addActionListener(this);
        add(argon, gc);

        gc.gridx = 0;
        gc.gridy++;

        //Potassium
        potassium.setPreferredSize(dimension);
        potassium.addActionListener(this);
        add(potassium, gc);

        //Calcium
        gc.gridx++;
        calcium.setPreferredSize(dimension);
        calcium.addActionListener(this);
        add(calcium, gc);

        //Scandium
        gc.gridx++;
        scandium.setPreferredSize(dimension);
        scandium.addActionListener(this);
        add(scandium, gc);

        //Titanium
        gc.gridx++;
        titanium.setPreferredSize(dimension);
        titanium.addActionListener(this);
        add(titanium, gc);

        //Vanadium
        gc.gridx++;
        vanadium.setPreferredSize(dimension);
        vanadium.addActionListener(this);
        add(vanadium, gc);

        //Chromium
        gc.gridx++;
        chromium.setPreferredSize(dimension);
        chromium.addActionListener(this);
        add(chromium, gc);

        //Manganese
        gc.gridx++;
        manganese.setPreferredSize(dimension);
        manganese.addActionListener(this);
        add(manganese, gc);

        //Iron
        gc.gridx++;
        iron.setPreferredSize(dimension);
        iron.addActionListener(this);
        add(iron, gc);

        //Cobalt
        gc.gridx++;
        cobalt.setPreferredSize(dimension);
        cobalt.addActionListener(this);
        add(cobalt, gc);

        //Nickel
        gc.gridx++;
        nickel.setPreferredSize(dimension);
        nickel.addActionListener(this);
        add(nickel, gc);

        //Copper
        gc.gridx++;
        copper.setPreferredSize(dimension);
        copper.addActionListener(this);
        add(copper, gc);

        //Zinc
        gc.gridx++;
        zinc.setPreferredSize(dimension);
        zinc.addActionListener(this);
        add(zinc, gc);

        //Gallium
        gc.gridx++;
        gallium.setPreferredSize(dimension);
        gallium.addActionListener(this);
        add(gallium, gc);

        //Germanium
        gc.gridx++;
        germanium.setPreferredSize(dimension);
        germanium.addActionListener(this);
        add(germanium, gc);

        //Arsenic
        gc.gridx++;
        arsenic.setPreferredSize(dimension);
        arsenic.addActionListener(this);
        add(arsenic, gc);

        //Selenium
        gc.gridx++;
        selenium.setPreferredSize(dimension);
        selenium.addActionListener(this);
        add(selenium, gc);

        //Bromine
        gc.gridx++;
        bromine.setPreferredSize(dimension);
        bromine.addActionListener(this);
        add(bromine, gc);

        //Krypton
        gc.gridx++;
        krypton.setPreferredSize(dimension);
        krypton.addActionListener(this);
        add(krypton, gc);


        gc.gridx = 0;
        gc.gridy++;

        //Rubidium
        rubidium.setPreferredSize(dimension);
        rubidium.addActionListener(this);
        add(rubidium, gc);

        //Strontium
        gc.gridx++;
        strontium.setPreferredSize(dimension);
        strontium.addActionListener(this);
        add(strontium, gc);

        //Yttrium
        gc.gridx++;
        yttrium.setPreferredSize(dimension);
        yttrium.addActionListener(this);
        add(yttrium, gc);

        //Zirconium
        gc.gridx++;
        zirconium.setPreferredSize(dimension);
        zirconium.addActionListener(this);
        add(zirconium, gc);

        //Niobium
        gc.gridx++;
        niobium.setPreferredSize(dimension);
        niobium.addActionListener(this);
        add(niobium, gc);

        //Molybdenum
        gc.gridx++;
        molybdenum.setPreferredSize(dimension);
        molybdenum.addActionListener(this);
        add(molybdenum, gc);

        //Technetium
        gc.gridx++;
        technetium.setPreferredSize(dimension);
        technetium.addActionListener(this);
        add(technetium, gc);

        //Ruthenium
        gc.gridx++;
        ruthenium.setPreferredSize(dimension);
        ruthenium.addActionListener(this);
        add(ruthenium, gc);

        //Rhodium
        gc.gridx++;
        rhodium.setPreferredSize(dimension);
        rhodium.addActionListener(this);
        add(rhodium, gc);

        //Palladium
        gc.gridx++;
        palladium.setPreferredSize(dimension);
        palladium.addActionListener(this);
        add(palladium, gc);

        //Silver
        gc.gridx++;
        silver.setPreferredSize(dimension);
        silver.addActionListener(this);
        add(silver, gc);

        //Cadmium
        gc.gridx++;
        cadmium.setPreferredSize(dimension);
        cadmium.addActionListener(this);
        add(cadmium, gc);

        //Indium
        gc.gridx++;
        indium.setPreferredSize(dimension);
        indium.addActionListener(this);
        add(indium, gc);

        //Tin
        gc.gridx++;
        tin.setPreferredSize(dimension);
        tin.addActionListener(this);
        add(tin, gc);

        //Antimony
        gc.gridx++;
        antimony.setPreferredSize(dimension);
        antimony.addActionListener(this);
        add(antimony, gc);

        //Tellurium
        gc.gridx++;
        tellurium.setPreferredSize(dimension);
        tellurium.addActionListener(this);
        add(tellurium, gc);

        //Iodine
        gc.gridx++;
        iodine.setPreferredSize(dimension);
        iodine.addActionListener(this);
        add(iodine, gc);

        //Xenon
        gc.gridx++;
        xenon.setPreferredSize(dimension);
        xenon.addActionListener(this);
        add(xenon, gc);


        gc.gridx = 0;
        gc.gridy++;

        //Caesium
        caesium.setPreferredSize(dimension);
        caesium.addActionListener(this);
        add(caesium, gc);

        //Barium
        gc.gridx++;
        barium.setPreferredSize(dimension);
        barium.addActionListener(this);
        add(barium, gc);

        //Lanthanum
        gc.gridx++;
        lanthanum.setPreferredSize(dimension);
        lanthanum.addActionListener(this);
        add(lanthanum, gc);

        //Hafnium
        gc.gridx++;
        hafnium.setPreferredSize(dimension);
        hafnium.addActionListener(this);
        add(hafnium, gc);

        //Tantalum
        gc.gridx++;
        tantalum.setPreferredSize(dimension);
        tantalum.addActionListener(this);
        add(tantalum, gc);

        //Tungsten
        gc.gridx++;
        tungsten.setPreferredSize(dimension);
        tungsten.addActionListener(this);
        add(tungsten, gc);

        //Rhenium
        gc.gridx++;
        rhenium.setPreferredSize(dimension);
        rhenium.addActionListener(this);
        add(rhenium, gc);

        //Osmium
        gc.gridx++;
        osmium.setPreferredSize(dimension);
        osmium.addActionListener(this);
        add(osmium, gc);

        //Iridium
        gc.gridx++;
        iridium.setPreferredSize(dimension);
        iridium.addActionListener(this);
        add(iridium, gc);

        //Platinum
        gc.gridx++;
        platinum.setPreferredSize(dimension);
        platinum.addActionListener(this);
        add(platinum, gc);


        //Gold
        gc.gridx++;
        gold.setPreferredSize(dimension);
        gold.addActionListener(this);
        add(gold, gc);

        //Mercury
        gc.gridx++;
        mercury.setPreferredSize(dimension);
        mercury.addActionListener(this);
        add(mercury, gc);

        //Thallium
        gc.gridx++;
        thallium.setPreferredSize(dimension);
        thallium.addActionListener(this);
        add(thallium, gc);

        //Lead
        gc.gridx++;
        lead.setPreferredSize(dimension);
        lead.addActionListener(this);
        add(lead, gc);

        //Bismuth
        gc.gridx++;
        bismuth.setPreferredSize(dimension);
        bismuth.addActionListener(this);
        add(bismuth, gc);

        //Polonium
        gc.gridx++;
        polonium.setPreferredSize(dimension);
        polonium.addActionListener(this);
        add(polonium, gc);

        //Astatine
        gc.gridx++;
        astatine.setPreferredSize(dimension);
        astatine.addActionListener(this);
        add(astatine, gc);

        //Radon
        gc.gridx++;
        radon.setPreferredSize(dimension);
        add(radon, gc);


        gc.gridx = 0;
        gc.gridy++;

        //Francium
        francium.setPreferredSize(dimension);
        francium.addActionListener(this);
        add(francium, gc);

        //Radium
        gc.gridx++;
        radium.setPreferredSize(dimension);
        radium.addActionListener(this);
        add(radium, gc);

        //Actinium
        gc.gridx++;
        actinium.setPreferredSize(dimension);
        actinium.addActionListener(this);
        add(actinium, gc);

        //Rutherfordium
        gc.gridx++;
        rutherfordium.setPreferredSize(dimension);
        rutherfordium.addActionListener(this);
        add(rutherfordium, gc);

        //Dubnium
        gc.gridx++;
        dubnium.setPreferredSize(dimension);
        dubnium.addActionListener(this);
        add(dubnium, gc);

        //Seaborgium
        gc.gridx++;
        seaborgium.setPreferredSize(dimension);
        seaborgium.addActionListener(this);
        add(seaborgium, gc);

        //Bohrium
        gc.gridx++;
        bohrium.setPreferredSize(dimension);
        bohrium.addActionListener(this);
        add(bohrium, gc);

        //Hassium
        gc.gridx++;
        hassium.setPreferredSize(dimension);
        hassium.addActionListener(this);
        add(hassium, gc);

        //Meitnerium
        gc.gridx++;
        meitnerium.setPreferredSize(dimension);
        meitnerium.addActionListener(this);
        add(meitnerium, gc);


        //Darmstadtium
        gc.gridx++;
        darmstadtium.setPreferredSize(dimension);
        darmstadtium.addActionListener(this);
        add(darmstadtium, gc);

        //Roentgenium
        gc.gridx++;
        roentgenium.setPreferredSize(dimension);
        roentgenium.addActionListener(this);
        add(roentgenium, gc);

        //Copernicium
        gc.gridx++;
        copernicium.setPreferredSize(dimension);
        copernicium.addActionListener(this);
        add(copernicium, gc);

        //Nihonium
        gc.gridx++;
        nihonium.setPreferredSize(dimension);
        add(nihonium, gc);

        //Flerovium
        gc.gridx++;
        flerovium.setPreferredSize(dimension);
        flerovium.addActionListener(this);
        add(flerovium, gc);

        //Moscovium
        gc.gridx++;
        moscovium.setPreferredSize(dimension);
        moscovium.addActionListener(this);
        add(moscovium, gc);

        //Livermorium
        gc.gridx++;
        livermorium.setPreferredSize(dimension);
        lawrencium.addActionListener(this);
        add(livermorium, gc);

        //Tennessine
        gc.gridx++;
        tennessine.setPreferredSize(dimension);
        tennessine.addActionListener(this);
        add(tennessine, gc);

        //Oganesson
        gc.gridx++;
        oganesson.setPreferredSize(dimension);
        oganesson.addActionListener(this);
        add(oganesson, gc);

        gc.insets = new Insets(15, 0, 0, 0);
        gc.gridx = 2;
        gc.gridy++;


        //Francium
        cerium.setPreferredSize(dimension);
        cerium.addActionListener(this);
        add(cerium, gc);

        //Praseodymium
        gc.gridx++;
        praseodymium.setPreferredSize(dimension);
        praseodymium.addActionListener(this);
        add(praseodymium, gc);

        //Neodymium
        gc.gridx++;
        neodymium.setPreferredSize(dimension);
        neodymium.addActionListener(this);
        add(neodymium, gc);

        //Promethium
        gc.gridx++;
        promethium.setPreferredSize(dimension);
        promethium.addActionListener(this);
        add(promethium, gc);

        //Samarium
        gc.gridx++;
        samarium.setPreferredSize(dimension);
        samarium.addActionListener(this);
        add(samarium, gc);

        //Europium
        gc.gridx++;
        europium.setPreferredSize(dimension);
        europium.addActionListener(this);
        add(europium, gc);

        //Gadolinium
        gc.gridx++;
        gadolinium.setPreferredSize(dimension);
        gadolinium.addActionListener(this);
        add(gadolinium, gc);


        //Terbium
        gc.gridx++;
        terbium.setPreferredSize(dimension);
        terbium.addActionListener(this);
        add(terbium, gc);

        //Dysprosium
        gc.gridx++;
        dysprosium.setPreferredSize(dimension);
        dysprosium.addActionListener(this);
        add(dysprosium, gc);


        //Holmium
        gc.gridx++;
        holmium.setPreferredSize(dimension);
        holmium.addActionListener(this);
        add(holmium, gc);

        //Erbium
        gc.gridx++;
        erbium.setPreferredSize(dimension);
        erbium.addActionListener(this);
        add(erbium, gc);

        //Thulium
        gc.gridx++;
        thulium.setPreferredSize(dimension);
        thulium.addActionListener(this);
        add(thulium, gc);

        //Ytterbium
        gc.gridx++;
        ytterbium.setPreferredSize(dimension);
        ytterbium.addActionListener(this);
        add(ytterbium, gc);

        //Lutetium
        gc.gridx++;
        lutetium.setPreferredSize(dimension);
        lutetium.addActionListener(this);
        add(lutetium, gc);


        gc.gridx = 2;
        gc.gridy++;
        gc.insets = new Insets(0, 0, 0, 0);

        //Thorium
        thorium.setPreferredSize(dimension);
        thorium.addActionListener(this);
        add(thorium, gc);

        //Protactinium
        gc.gridx++;
        protactinium.setPreferredSize(dimension);
        protactinium.addActionListener(this);
        add(protactinium, gc);

        //Uranium
        gc.gridx++;
        uranium.setPreferredSize(dimension);
        uranium.addActionListener(this);
        add(uranium, gc);

        //Neptunium
        gc.gridx++;
        neptunium.setPreferredSize(dimension);
        neptunium.addActionListener(this);
        add(neptunium, gc);

        //Plutonium
        gc.gridx++;
        plutonium.setPreferredSize(dimension);
        plutonium.addActionListener(this);
        add(plutonium, gc);

        //Americium
        gc.gridx++;
        americium.setPreferredSize(dimension);
        americium.addActionListener(this);
        add(americium, gc);

        //Curium
        gc.gridx++;
        curium.setPreferredSize(dimension);
        curium.addActionListener(this);
        add(curium, gc);


        //Berkelium
        gc.gridx++;
        berkelium.setPreferredSize(dimension);
        berkelium.addActionListener(this);
        add(berkelium, gc);

        //Californium
        gc.gridx++;
        californium.setPreferredSize(dimension);
        californium.addActionListener(this);
        add(californium, gc);


        //Einsteinium
        gc.gridx++;
        einsteinium.setPreferredSize(dimension);
        einsteinium.addActionListener(this);
        add(einsteinium, gc);

        //Fermium
        gc.gridx++;
        fermium.setPreferredSize(dimension);
        fermium.addActionListener(this);
        add(fermium, gc);

        //Mendelevium
        gc.gridx++;
        mendelevium.setPreferredSize(dimension);
        mendelevium.addActionListener(this);
        add(mendelevium, gc);

        //Nobelium
        gc.gridx++;
        nobelium.setPreferredSize(dimension);
        nobelium.addActionListener(this);
        add(nobelium, gc);

        //Lawrencium
        gc.gridx++;
        lawrencium.setPreferredSize(dimension);
        lawrencium.addActionListener(this);
        add(lawrencium, gc);


        gc.gridx = 0;
        gc.gridy++;
        gc.anchor = GridBagConstraints.LAST_LINE_START;
        gc.insets = new Insets(10, 0, 0, 0);
        add(back, gc);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == back) {
            if (backListener != null) {
                backListener.onBackClick();
            }
        } else {
            JButton button = (JButton) actionEvent.getSource();
            System.out.println(button.getText());
            if (periodicTableListener != null) {
                periodicTableListener.onElementSelected(button.getText());
            }
        }
    }

    public void setPeriodicTableListener(PeriodicTableListener periodicTableListener) {
        this.periodicTableListener = periodicTableListener;
    }

    public void setBackListener(BackListener backListener) {
        this.backListener = backListener;
    }
}
