package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue
  private Long portfolioId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String description;

  @ManyToOne
  @JoinColumn(name = "client_id")
  private Client client;

  @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
  private List<Security> securities;

  protected Portfolio() {

  }

  public Portfolio(String name, String description, Client client) {
    this.name = name;
    this.description = description;
    this.client = client;
  }

  public Long getPortfolioId() {
    return portfolioId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public List<Security> getSecurities() {
    return securities;
  }

  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }
}
