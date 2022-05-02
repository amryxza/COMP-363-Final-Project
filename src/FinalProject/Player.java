package FinalProject;

public class Player {
    /**
     * starting variables:
     * academic focus: 0
     * impulsivity: 0
     * will: -10
     * kindness: 0
     * empathy: 0
     */
    String Name;
    int AcademicFocus;
    int Impulsiveness;
    int Will;
    int Kindness;
    int empathy;

     /** jamie_trust: -20
     * --> (+ .5(kindness) - academic focus)
     * jamie_understanding: -20
     * jamie_interest: -20
     * --> (+ empathy + .5(+ impulsivity + will) - academic focus - kindness)
     */

    String jamieTrust;
    String jamieUnderstaning;
    String jamieInterest;



     /** cal_trust: 20
     * --> (+ academic focus - .5 (kindness + empathy))
     * cal_understanding: -40
     * --> (+ .2 (empathy))
     * cal_interest: 20
     */
     String calTrust;
    String calAcademicFocus;
    String calUnderstaning;
    String calInterest;
    String calKindness;
    String calempathy;
    String calImpulsiveness;
    String calWill;

     /** cj_trust: 0
     * cj_understanding: 0
     * cj_interest: 0
     */
     String cjTrust;
    String cjAcademicFocus;
    String cjUnderstaning;
    String cjInterest;
    String cjKindness;
    String cjempathy;
    String cjImpulsiveness;
    String cjWill;
}
