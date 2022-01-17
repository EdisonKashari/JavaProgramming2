package day_39_Recap.StateTask;

public class State {
    private String name,governor,senator,politicalParty,abbreviation;
    private double population,stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name==null){
            System.err.println(name+" Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if ( governor.isEmpty() || governor==null ){
            System.out.println(governor+" Invalid name");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator==null){
            System.err.println(senator+" Invalid name");
            System.exit(1);
        }
        this.senator = senator;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if ( politicalParty.isEmpty()|| politicalParty==null ){
            System.err.println(politicalParty+" Invalid name");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null || abbreviation.isEmpty()){
            System.err.println(abbreviation+" Invalid name");
        }
        this.abbreviation = abbreviation;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population<=0){
            System.err.println(population+" Invalid number");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0){
            System.err.println(stateTax+" Invalid number");
        }
        this.stateTax = stateTax;
    }

    public State(String name, String governor, String senator, String politicalParty, String abbreviation, double population, double stateTax) {
       setName(name);
        setGovernor(governor);
        setSenator(senator);
        setPoliticalParty(politicalParty);
        setAbbreviation(abbreviation);
       setPopulation(population);
       setStateTax(stateTax);
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

/*
 Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()

 */
