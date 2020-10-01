package flexagon.fusion.hrdemo.model.entities;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 20 17:26:01 CDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobHistoryEOImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    EmployeeId,
    StartDate,
    EndDate,
    JobId,
    DepartmentId,
    Departments,
    Employees,
    Jobs;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    public int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    public static final int firstIndex()
    {
      return firstIndex;
    }

    public static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    public static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }


  public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
  public static final int STARTDATE = AttributesEnum.StartDate.index();
  public static final int ENDDATE = AttributesEnum.EndDate.index();
  public static final int JOBID = AttributesEnum.JobId.index();
  public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
  public static final int DEPARTMENTS = AttributesEnum.Departments.index();
  public static final int EMPLOYEES = AttributesEnum.Employees.index();
  public static final int JOBS = AttributesEnum.Jobs.index();

  /**
   * This is the default constructor (do not remove).
   */
  public JobHistoryEOImpl()
  {
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("flexagon.fusion.hrdemo.model.entities.JobHistoryEO");
  }


  /**
   * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
   * @return the value of EmployeeId
   */
  public Integer getEmployeeId()
  {
    return (Integer) getAttributeInternal(EMPLOYEEID);
  }

  /**
   * Sets <code>value</code> as the attribute value for EmployeeId.
   * @param value value to set the EmployeeId
   */
  public void setEmployeeId(Integer value)
  {
    setAttributeInternal(EMPLOYEEID, value);
  }

  /**
   * Gets the attribute value for StartDate, using the alias name StartDate.
   * @return the value of StartDate
   */
  public Timestamp getStartDate()
  {
    return (Timestamp) getAttributeInternal(STARTDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for StartDate.
   * @param value value to set the StartDate
   */
  public void setStartDate(Timestamp value)
  {
    setAttributeInternal(STARTDATE, value);
  }

  /**
   * Gets the attribute value for EndDate, using the alias name EndDate.
   * @return the value of EndDate
   */
  public Timestamp getEndDate()
  {
    return (Timestamp) getAttributeInternal(ENDDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for EndDate.
   * @param value value to set the EndDate
   */
  public void setEndDate(Timestamp value)
  {
    setAttributeInternal(ENDDATE, value);
  }

  /**
   * Gets the attribute value for JobId, using the alias name JobId.
   * @return the value of JobId
   */
  public String getJobId()
  {
    return (String) getAttributeInternal(JOBID);
  }

  /**
   * Sets <code>value</code> as the attribute value for JobId.
   * @param value value to set the JobId
   */
  public void setJobId(String value)
  {
    setAttributeInternal(JOBID, value);
  }

  /**
   * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
   * @return the value of DepartmentId
   */
  public Integer getDepartmentId()
  {
    return (Integer) getAttributeInternal(DEPARTMENTID);
  }

  /**
   * Sets <code>value</code> as the attribute value for DepartmentId.
   * @param value value to set the DepartmentId
   */
  public void setDepartmentId(Integer value)
  {
    setAttributeInternal(DEPARTMENTID, value);
  }

  /**
   * @return the associated entity DepartmentsEOImpl.
   */
  public DepartmentsEOImpl getDepartments()
  {
    return (DepartmentsEOImpl) getAttributeInternal(DEPARTMENTS);
  }

  /**
   * Sets <code>value</code> as the associated entity DepartmentsEOImpl.
   */
  public void setDepartments(DepartmentsEOImpl value)
  {
    setAttributeInternal(DEPARTMENTS, value);
  }

  /**
   * @return the associated entity EmployeesEOImpl.
   */
  public EmployeesEOImpl getEmployees()
  {
    return (EmployeesEOImpl) getAttributeInternal(EMPLOYEES);
  }

  /**
   * Sets <code>value</code> as the associated entity EmployeesEOImpl.
   */
  public void setEmployees(EmployeesEOImpl value)
  {
    setAttributeInternal(EMPLOYEES, value);
  }

  /**
   * @return the associated entity JobsEOImpl.
   */
  public JobsEOImpl getJobs()
  {
    return (JobsEOImpl) getAttributeInternal(JOBS);
  }

  /**
   * Sets <code>value</code> as the associated entity JobsEOImpl.
   */
  public void setJobs(JobsEOImpl value)
  {
    setAttributeInternal(JOBS, value);
  }

  /**
   * @param employeeId key constituent
   * @param startDate key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Integer employeeId, Timestamp startDate)
  {
    return new Key(new Object[] { employeeId, startDate });
  }


}
