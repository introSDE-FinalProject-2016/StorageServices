
package introsde.finalproject.soap.localdbservices.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.PersonWrapper
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/")
    @RequestWrapper(localName = "getPersonList", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetPersonList")
    @ResponseWrapper(localName = "getPersonListResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetPersonListResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getPersonListRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getPersonListResponse")
    public PersonWrapper getPersonList();

    /**
     * 
     * @param pid
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetPersonResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getPersonRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getPersonResponse")
    public Person getPerson(
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param measure
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "pid", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.CreatePersonResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/createPersonRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/createPersonResponse")
    public int createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "measure", targetNamespace = "")
        List<Measure> measure);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "pid", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.UpdatePersonResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/updatePersonRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/updatePersonResponse")
    public int updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param pid
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "responsePersonCode", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.DeletePersonResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/deletePersonRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param goal
     * @param pid
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "gid", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.CreateGoalResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/createGoalRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/createGoalResponse")
    public int createGoal(
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal,
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param pid
     * @param measureName
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.GoalWrapper
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/")
    @RequestWrapper(localName = "getGoal", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetGoal")
    @ResponseWrapper(localName = "getGoalResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetGoalResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getGoalRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getGoalResponse")
    public GoalWrapper getGoal(
        @WebParam(name = "pid", targetNamespace = "")
        int pid,
        @WebParam(name = "measureName", targetNamespace = "")
        String measureName);

    /**
     * 
     * @param pid
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.GoalWrapper
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/")
    @RequestWrapper(localName = "getGoalList", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetGoalList")
    @ResponseWrapper(localName = "getGoalListResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetGoalListResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getGoalListRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getGoalListResponse")
    public GoalWrapper getGoalList(
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param goal
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "gid", targetNamespace = "")
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.UpdateGoalResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/updateGoalRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/updateGoalResponse")
    public int updateGoal(
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal);

    /**
     * 
     * @param gid
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "responseGoalCode", targetNamespace = "")
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.DeleteGoalResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/deleteGoalRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/deleteGoalResponse")
    public int deleteGoal(
        @WebParam(name = "gid", targetNamespace = "")
        int gid);

    /**
     * 
     * @param measure
     * @param pid
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "mid", targetNamespace = "")
    @RequestWrapper(localName = "createMeasure", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.CreateMeasure")
    @ResponseWrapper(localName = "createMeasureResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.CreateMeasureResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/createMeasureRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/createMeasureResponse")
    public int createMeasure(
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure,
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param pid
     * @param measureName
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.MeasureWrapper
     */
    @WebMethod
    @WebResult(name = "measuresHealth", targetNamespace = "")
    @RequestWrapper(localName = "getMeasure", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetMeasure")
    @ResponseWrapper(localName = "getMeasureResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetMeasureResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getMeasureRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getMeasureResponse")
    public MeasureWrapper getMeasure(
        @WebParam(name = "pid", targetNamespace = "")
        int pid,
        @WebParam(name = "measureName", targetNamespace = "")
        String measureName);

    /**
     * 
     * @param mid
     * @param pid
     * @param measureName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "value", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureValue", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetMeasureValue")
    @ResponseWrapper(localName = "getMeasureValueResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetMeasureValueResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getMeasureValueRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getMeasureValueResponse")
    public String getMeasureValue(
        @WebParam(name = "pid", targetNamespace = "")
        int pid,
        @WebParam(name = "measureName", targetNamespace = "")
        String measureName,
        @WebParam(name = "mid", targetNamespace = "")
        int mid);

    /**
     * 
     * @param pid
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.MeasureWrapper
     */
    @WebMethod
    @WebResult(name = "historyHealth", targetNamespace = "")
    @RequestWrapper(localName = "getHistoryHealth", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetHistoryHealth")
    @ResponseWrapper(localName = "getHistoryHealthResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetHistoryHealthResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getHistoryHealthRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getHistoryHealthResponse")
    public MeasureWrapper getHistoryHealth(
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param measure
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "mid", targetNamespace = "")
    @RequestWrapper(localName = "updateMeasure", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.UpdateMeasure")
    @ResponseWrapper(localName = "updateMeasureResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.UpdateMeasureResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/updateMeasureRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/updateMeasureResponse")
    public int updateMeasure(
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param mid
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "responseMeasureCode", targetNamespace = "")
    @RequestWrapper(localName = "deleteMeasure", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.DeleteMeasure")
    @ResponseWrapper(localName = "deleteMeasureResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.DeleteMeasureResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/deleteMeasureRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/deleteMeasureResponse")
    public int deleteMeasure(
        @WebParam(name = "mid", targetNamespace = "")
        int mid);

    /**
     * 
     * @return
     *     returns introsde.finalproject.soap.localdbservices.ws.MeasureDefinitionWrapper
     */
    @WebMethod
    @WebResult(name = "measureNames", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/")
    @RequestWrapper(localName = "getMeasureDefinitionNames", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetMeasureDefinitionNames")
    @ResponseWrapper(localName = "getMeasureDefinitionNamesResponse", targetNamespace = "http://ws.localdbservices.soap.finalproject.introsde/", className = "introsde.finalproject.soap.localdbservices.ws.GetMeasureDefinitionNamesResponse")
    @Action(input = "http://ws.localdbservices.soap.finalproject.introsde/People/getMeasureDefinitionNamesRequest", output = "http://ws.localdbservices.soap.finalproject.introsde/People/getMeasureDefinitionNamesResponse")
    public MeasureDefinitionWrapper getMeasureDefinitionNames();

}