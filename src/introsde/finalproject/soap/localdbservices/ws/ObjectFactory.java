
package introsde.finalproject.soap.localdbservices.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.finalproject.soap.localdbservices.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HealthProfileHistory_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "HealthProfile-history");
    private final static QName _UpdateGoal_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "updateGoal");
    private final static QName _People_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "People");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "createPerson");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "updateGoalResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "createPersonResponse");
    private final static QName _GetPersonListResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getPersonListResponse");
    private final static QName _GetGoalList_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getGoalList");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "updateMeasureResponse");
    private final static QName _CreateGoal_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "deleteGoal");
    private final static QName _GetPersonList_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getPersonList");
    private final static QName _GetGoalListResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getGoalListResponse");
    private final static QName _Goals_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "Goals");
    private final static QName _GetMeasureValue_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getMeasureValue");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "updatePerson");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "createGoalResponse");
    private final static QName _GetGoalResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getGoalResponse");
    private final static QName _GetPerson_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getPerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "updatePersonResponse");
    private final static QName _GetGoal_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getGoal");
    private final static QName _DeleteMeasure_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "deleteMeasure");
    private final static QName _GetMeasureDefinitionNamesResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getMeasureDefinitionNamesResponse");
    private final static QName _GetHistoryHealth_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getHistoryHealth");
    private final static QName _GetMeasureDefinitionNames_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getMeasureDefinitionNames");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "deleteGoalResponse");
    private final static QName _GetMeasureResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getMeasureResponse");
    private final static QName _CreateMeasureResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "createMeasureResponse");
    private final static QName _GetMeasureValueResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getMeasureValueResponse");
    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "deleteMeasureResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "deletePersonResponse");
    private final static QName _GetHistoryHealthResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getHistoryHealthResponse");
    private final static QName _GetMeasure_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getMeasure");
    private final static QName _CreateMeasure_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "createMeasure");
    private final static QName _GetPersonResponse_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "getPersonResponse");
    private final static QName _UpdateMeasure_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "updateMeasure");
    private final static QName _MeasureNames_QNAME = new QName("http://ws.localdbservices.soap.finalproject.introsde/", "MeasureNames");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.finalproject.soap.localdbservices.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link GetHistoryHealth }
     * 
     */
    public GetHistoryHealth createGetHistoryHealth() {
        return new GetHistoryHealth();
    }

    /**
     * Create an instance of {@link GetMeasureDefinitionNames }
     * 
     */
    public GetMeasureDefinitionNames createGetMeasureDefinitionNames() {
        return new GetMeasureDefinitionNames();
    }

    /**
     * Create an instance of {@link GetMeasureResponse }
     * 
     */
    public GetMeasureResponse createGetMeasureResponse() {
        return new GetMeasureResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link GetMeasureDefinitionNamesResponse }
     * 
     */
    public GetMeasureDefinitionNamesResponse createGetMeasureDefinitionNamesResponse() {
        return new GetMeasureDefinitionNamesResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetHistoryHealthResponse }
     * 
     */
    public GetHistoryHealthResponse createGetHistoryHealthResponse() {
        return new GetHistoryHealthResponse();
    }

    /**
     * Create an instance of {@link GetMeasure }
     * 
     */
    public GetMeasure createGetMeasure() {
        return new GetMeasure();
    }

    /**
     * Create an instance of {@link CreateMeasure }
     * 
     */
    public CreateMeasure createCreateMeasure() {
        return new CreateMeasure();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     * 
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link MeasureDefinitionWrapper }
     * 
     */
    public MeasureDefinitionWrapper createMeasureDefinitionWrapper() {
        return new MeasureDefinitionWrapper();
    }

    /**
     * Create an instance of {@link CreateMeasureResponse }
     * 
     */
    public CreateMeasureResponse createCreateMeasureResponse() {
        return new CreateMeasureResponse();
    }

    /**
     * Create an instance of {@link GetMeasureValueResponse }
     * 
     */
    public GetMeasureValueResponse createGetMeasureValueResponse() {
        return new GetMeasureValueResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalList }
     * 
     */
    public GetGoalList createGetGoalList() {
        return new GetGoalList();
    }

    /**
     * Create an instance of {@link GetPersonListResponse }
     * 
     */
    public GetPersonListResponse createGetPersonListResponse() {
        return new GetPersonListResponse();
    }

    /**
     * Create an instance of {@link PersonWrapper }
     * 
     */
    public PersonWrapper createPersonWrapper() {
        return new PersonWrapper();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link MeasureWrapper }
     * 
     */
    public MeasureWrapper createMeasureWrapper() {
        return new MeasureWrapper();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalResponse }
     * 
     */
    public GetGoalResponse createGetGoalResponse() {
        return new GetGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoal }
     * 
     */
    public GetGoal createGetGoal() {
        return new GetGoal();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link GetPersonList }
     * 
     */
    public GetPersonList createGetPersonList() {
        return new GetPersonList();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     * 
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link GoalWrapper }
     * 
     */
    public GoalWrapper createGoalWrapper() {
        return new GoalWrapper();
    }

    /**
     * Create an instance of {@link GetMeasureValue }
     * 
     */
    public GetMeasureValue createGetMeasureValue() {
        return new GetMeasureValue();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetGoalListResponse }
     * 
     */
    public GetGoalListResponse createGetGoalListResponse() {
        return new GetGoalListResponse();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Person.CurrentHealth }
     * 
     */
    public Person.CurrentHealth createPersonCurrentHealth() {
        return new Person.CurrentHealth();
    }

    /**
     * Create an instance of {@link Person.Goals }
     * 
     */
    public Person.Goals createPersonGoals() {
        return new Person.Goals();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "HealthProfile-history")
    public JAXBElement<MeasureWrapper> createHealthProfileHistory(MeasureWrapper value) {
        return new JAXBElement<MeasureWrapper>(_HealthProfileHistory_QNAME, MeasureWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "People")
    public JAXBElement<PersonWrapper> createPeople(PersonWrapper value) {
        return new JAXBElement<PersonWrapper>(_People_QNAME, PersonWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getPersonListResponse")
    public JAXBElement<GetPersonListResponse> createGetPersonListResponse(GetPersonListResponse value) {
        return new JAXBElement<GetPersonListResponse>(_GetPersonListResponse_QNAME, GetPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getGoalList")
    public JAXBElement<GetGoalList> createGetGoalList(GetGoalList value) {
        return new JAXBElement<GetGoalList>(_GetGoalList_QNAME, GetGoalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getPersonList")
    public JAXBElement<GetPersonList> createGetPersonList(GetPersonList value) {
        return new JAXBElement<GetPersonList>(_GetPersonList_QNAME, GetPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getGoalListResponse")
    public JAXBElement<GetGoalListResponse> createGetGoalListResponse(GetGoalListResponse value) {
        return new JAXBElement<GetGoalListResponse>(_GetGoalListResponse_QNAME, GetGoalListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "Goals")
    public JAXBElement<GoalWrapper> createGoals(GoalWrapper value) {
        return new JAXBElement<GoalWrapper>(_Goals_QNAME, GoalWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getMeasureValue")
    public JAXBElement<GetMeasureValue> createGetMeasureValue(GetMeasureValue value) {
        return new JAXBElement<GetMeasureValue>(_GetMeasureValue_QNAME, GetMeasureValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getGoalResponse")
    public JAXBElement<GetGoalResponse> createGetGoalResponse(GetGoalResponse value) {
        return new JAXBElement<GetGoalResponse>(_GetGoalResponse_QNAME, GetGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getGoal")
    public JAXBElement<GetGoal> createGetGoal(GetGoal value) {
        return new JAXBElement<GetGoal>(_GetGoal_QNAME, GetGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureDefinitionNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getMeasureDefinitionNamesResponse")
    public JAXBElement<GetMeasureDefinitionNamesResponse> createGetMeasureDefinitionNamesResponse(GetMeasureDefinitionNamesResponse value) {
        return new JAXBElement<GetMeasureDefinitionNamesResponse>(_GetMeasureDefinitionNamesResponse_QNAME, GetMeasureDefinitionNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getHistoryHealth")
    public JAXBElement<GetHistoryHealth> createGetHistoryHealth(GetHistoryHealth value) {
        return new JAXBElement<GetHistoryHealth>(_GetHistoryHealth_QNAME, GetHistoryHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureDefinitionNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getMeasureDefinitionNames")
    public JAXBElement<GetMeasureDefinitionNames> createGetMeasureDefinitionNames(GetMeasureDefinitionNames value) {
        return new JAXBElement<GetMeasureDefinitionNames>(_GetMeasureDefinitionNames_QNAME, GetMeasureDefinitionNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getMeasureResponse")
    public JAXBElement<GetMeasureResponse> createGetMeasureResponse(GetMeasureResponse value) {
        return new JAXBElement<GetMeasureResponse>(_GetMeasureResponse_QNAME, GetMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "createMeasureResponse")
    public JAXBElement<CreateMeasureResponse> createCreateMeasureResponse(CreateMeasureResponse value) {
        return new JAXBElement<CreateMeasureResponse>(_CreateMeasureResponse_QNAME, CreateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getMeasureValueResponse")
    public JAXBElement<GetMeasureValueResponse> createGetMeasureValueResponse(GetMeasureValueResponse value) {
        return new JAXBElement<GetMeasureValueResponse>(_GetMeasureValueResponse_QNAME, GetMeasureValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistoryHealthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getHistoryHealthResponse")
    public JAXBElement<GetHistoryHealthResponse> createGetHistoryHealthResponse(GetHistoryHealthResponse value) {
        return new JAXBElement<GetHistoryHealthResponse>(_GetHistoryHealthResponse_QNAME, GetHistoryHealthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getMeasure")
    public JAXBElement<GetMeasure> createGetMeasure(GetMeasure value) {
        return new JAXBElement<GetMeasure>(_GetMeasure_QNAME, GetMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "createMeasure")
    public JAXBElement<CreateMeasure> createCreateMeasure(CreateMeasure value) {
        return new JAXBElement<CreateMeasure>(_CreateMeasure_QNAME, CreateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureDefinitionWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.localdbservices.soap.finalproject.introsde/", name = "MeasureNames")
    public JAXBElement<MeasureDefinitionWrapper> createMeasureNames(MeasureDefinitionWrapper value) {
        return new JAXBElement<MeasureDefinitionWrapper>(_MeasureNames_QNAME, MeasureDefinitionWrapper.class, null, value);
    }

}
