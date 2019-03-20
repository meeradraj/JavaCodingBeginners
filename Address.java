/**
 * The Class Address.
 */
public class Address {

	/** The street num. */
	private String streetNum;

	/** The street address. */
	private String streetAddress;

	/** The apt suite other. */
	private String aptSuiteOther;

	/** The city. */
	private String city;

	/** The state. */
	private String state;
	
	/** The state abbr. */
	private String stateAbbr;

	/** The zip code. */
	private String zipCode;

	/** The country. */
	private String country;

	/** The country iso code. */
	private String countryIsoCode;

	/** The address type. */
	private String addressType;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/**
	 * Checks if is commercial.
	 *
	 * @return true, if is commercial
	 */
	public boolean isCommercial() {
		return this.addressType.equalsIgnoreCase("Commercial");
	}

	/**
	 * Checks if is residential.
	 *
	 * @return true, if is residential
	 */
	public boolean isResidential() {
		return this.addressType.equalsIgnoreCase("Residential");
	}

	/**
	 * Instantiates a new address.
	 */
	public Address() {
		super();
	}

	/**
	 * Instantiates a new address.
	 *
	 * @param streetNum
	 *            the street num
	 * @param streetAddress
	 *            the street address
	 * @param aptSuiteOther
	 *            the apt suite other
	 * @param city
	 *            the city
	 * @param state
	 *            the state
	 * @param stateAbbr
	 *            the state abbr
	 * @param zipCode
	 *            the zip code
	 * @param country
	 *            the country
	 * @param countryIsoCode
	 *            the country iso code
	 * @param addressType
	 *            the address type
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 */
	public Address(final String streetNum, final String streetAddress, final String aptSuiteOther, final String city,
			final String state, final String stateAbbr, final String zipCode, final String country,
			final String countryIsoCode, final String addressType, final String firstName, final String lastName) {
		super();
		this.streetNum = streetNum;
		this.streetAddress = streetAddress;
		this.aptSuiteOther = aptSuiteOther;
		this.city = city;
		this.state = state;
		this.stateAbbr = stateAbbr;
		this.zipCode = zipCode;
		this.country = country;
		this.countryIsoCode = countryIsoCode;
		this.addressType = addressType;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Gets the street num.
	 *
	 * @return the street num
	 */
	public String getStreetNum() {
		return streetNum;
	}

	/**
	 * Sets the street num.
	 *
	 * @param streetNum
	 *            the new street num
	 */
	public void setStreetNum(final String streetNum) {
		this.streetNum = streetNum;
	}

	/**
	 * Gets the street address.
	 *
	 * @return the street address
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the street address.
	 *
	 * @param streetAddress
	 *            the new street address
	 */
	public void setStreetAddress(final String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Gets full address.
	 *
	 * @return the full address
	 */
	public String getFullAddress() {
		return getStreetNum() + " " + getStreetAddress();
	}

	/**
	 * Gets the apt suite other.
	 *
	 * @return the apt suite other
	 */
	public String getAptSuiteOther() {
		return aptSuiteOther;
	}

	/**
	 * Sets the apt suite other.
	 *
	 * @param aptSuiteOther
	 *            the new apt suite other
	 */
	public void setAptSuiteOther(final String aptSuiteOther) {
		this.aptSuiteOther = aptSuiteOther;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the new city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/* * @return the preference
			 */
			public String getbpreference() {
				return getbpreference();
			}
	
	
	/**
	 * Sets the state.
	 *
	 * @param state
	 *            the new state
	 */
	public void setState(final String state) {
		this.state = state;
	}

	/**
	 * Gets the state abbr.
	 *
	 * @return the state abbr
	 */
	public String getStateAbbr() {
		return stateAbbr;
	}

	/**
	 * Sets the state abbr.
	 *
	 * @param stateAbbr
	 *            the new state abbr
	 */
	public void setStateAbbr(final String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}

	/**
	 * Gets the zip code.
	 *
	 * @return the zip code
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the zip code.
	 *
	 * @param zipCode
	 *            the new zip code
	 */
	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country
	 *            the new country
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * Gets the country iso code.
	 *
	 * @return the country iso code
	 */
	public String getCountryIsoCode() {
		return countryIsoCode;
	}

	/**
	 * Sets the country iso code.
	 *
	 * @param countryIsoCode
	 *            the new country iso code
	 */
	public void setCountryIsoCode(final String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the address type.
	 *
	 * @return the address type
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * Sets the address type.
	 *
	 * @param addressType
	 *            the new address type
	 */
	public void setAddressType(final String addressType) {
		this.addressType = addressType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", streetAddress=" + streetAddress + ", aptSuiteOther="
				+ aptSuiteOther + ", city=" + city + ", state=" + state + ", stateAbbr=" + stateAbbr + ", zipCode="
				+ zipCode + ", country=" + country + ", countryIsoCode=" + countryIsoCode + ", addressType="
				+ addressType + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressType == null) ? 0 : addressType.hashCode());
		result = prime * result + ((aptSuiteOther == null) ? 0 : aptSuiteOther.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((countryIsoCode == null) ? 0 : countryIsoCode.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((stateAbbr == null) ? 0 : stateAbbr.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
		result = prime * result + ((streetNum == null) ? 0 : streetNum.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Address other = (Address) obj;
		if (addressType == null) {
			if (other.addressType != null)
				return false;
		} else if (!addressType.equals(other.addressType))
			return false;
		if (aptSuiteOther == null) {
			if (other.aptSuiteOther != null)
				return false;
		} else if (!aptSuiteOther.equals(other.aptSuiteOther))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (countryIsoCode == null) {
			if (other.countryIsoCode != null)
				return false;
		} else if (!countryIsoCode.equals(other.countryIsoCode))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (stateAbbr == null) {
			if (other.stateAbbr != null)
				return false;
		} else if (!stateAbbr.equals(other.stateAbbr))
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		if (streetNum == null) {
			if (other.streetNum != null)
				return false;
		} else if (!streetNum.equals(other.streetNum))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

}
