package uk.ac.ucl.cs.mr;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FactsBean {

    public List<Fact> facts;

    public FactsBean(List<Fact> facts) {
        this.facts = facts;
    }

}
