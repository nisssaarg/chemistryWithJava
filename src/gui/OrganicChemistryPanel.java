package gui;

import listeners.BackListener;

import javax.swing.*;
import java.awt.*;

public class OrganicChemistryPanel extends JPanel {


    private final OrganicChemistryDetailsHolder organicChemistryDetailsHolder;
    private final JButton back;
    GridBagConstraints gc = new GridBagConstraints();
    private BackListener backListener;

    public OrganicChemistryPanel() {

        setLayout(new BorderLayout());
        organicChemistryDetailsHolder = new OrganicChemistryDetailsHolder();
        back = new JButton("Back");

        add(organicChemistryDetailsHolder, BorderLayout.CENTER);
        add(back, BorderLayout.SOUTH);

        back.addActionListener(actionEvent -> {
            if (backListener != null) {
                backListener.onBackClick();
            }
        });

    }
	/*
	private void setLayout() {
		SearchContainer.setLayout(new GridBagLayout());
		GridBagConstraints gc1= new GridBagConstraints();
		gc1.gridx=0;
		gc1.gridy=0;
		gc1.fill = GridBagConstraints.NONE;
		
		Dimension textBox=new Dimension(250,20);
		SearchContainer.add(Label,gc1);
		
		gc1.gridx++;
		Name.setPreferredSize(textBox);
		SearchContainer.add(Name,gc1);
		
		gc1.gridy++;
		Dimension submitButton=new Dimension(70,50);
		
		Submit.setPreferredSize(submitButton);
		Submit.addActionListener(this);
		SearchContainer.add(Submit,gc1);
		
		gc1.gridx++;
		gc1.gridy--;
		SearchContainer.add(FormulaContainer,gc1);
		
		gc.gridx=0;
		gc.gridy=0;
		
		add(SearchContainer,gc);
	} */


    public void setBackListener(BackListener backListener) {
        this.backListener = backListener;
    }
}
