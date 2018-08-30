package stqa.pft.addressbook.model;

import java.io.File;

/**
 * Created by prohorova on 10.07.2018.
 */
public class ContactData {

  private int id = Integer.MAX_VALUE;
  private String firstname;
  private String lastname;
  private String workPhone;
  private String mobilePhone;
  private String homePhone;
  private String allPhones;
  private String group;
  private File photo;

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public int getId() {
    return id;
  }


  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  public String getFirstname() {
    return firstname;
  }


  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public String getLastname() {
    return lastname;
  }

  public ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

  public String getWorkPhone() {
    return workPhone;
  }


  public ContactData withMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }


  public ContactData withHomePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  public String getHomePhone() {
    return homePhone;
  }


  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public String getAllPhones() {
    return allPhones;
  }



  public String getGroup() {
    return group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData contactData = (ContactData) o;

    if (id != contactData.id) return false;
    return firstname != null ?firstname.equals(contactData.firstname) : contactData.firstname == null;
  }
}
