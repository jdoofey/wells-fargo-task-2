package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.List;
/* clientId
 * firstName
 * lastName
 * address
 * phone
 * email
 */
@Entity
public class Client {

  @Id
  @GeneratedValue()
  private Long clientId;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  @ManyToOne
  @JoinColumn(name = "advisorId")
  private Advisor advisor;

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
  private List<Porfolio> portfolios;

  protected Client() {

  }

  public Client(String firstName, String lastName, Advisor advisor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.advisor = advisor;
  }

  public Long getClientId() {
    return clientId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Advisor getAdvisor() {
    return advisor;
  }

  public void setAdvisor(Advisor advisor) {
    this.advisor = advisor;
  }

  public List<Portfolio> getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(List<Portfolio> portfolios) {
    this.portfolios = portfolios;
  }
}
