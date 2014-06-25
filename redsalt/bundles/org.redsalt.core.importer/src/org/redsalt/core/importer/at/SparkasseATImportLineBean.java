package org.redsalt.core.importer.at;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * Auftraggeber; Auftraggeber Kontonr./IBAN; Bezeichnung; Valutadatum; Betrag;
 * W?hrung; Auftraggeber BLZ/BIC; Partnername; Partner Kontonr./IBAN; Partner
 * BLZ/BIC; Kundendaten/Zahlungsreferenz; Buchungsdatum; Umsatzzeile 1;
 * Umsatzzeile 2; Zusatztext; Ersterfassungsreferenz
 * 
 * @author marco
 *
 */
public class SparkasseATImportLineBean {

	public static String[] columns = new String[] { "auftraggeber",
			"auftraggeber_kontoNrOrIBAN", "bezeichnung", "valutadatum",
			"betrag", "waehrung", "auftraggeber_BlzOrBic", "partnername",
			"partner_kontoNrOrIBAN", "partner_BlzOrBic",
			"kundendatenOrZahlungsreferenz", "buchungsdatum", "umsatzzeile1",
			"umsatzzeile2", "zusatztext", "ersterfassungsreferenz" };

	public static final DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("dd.MM.yyyy");

	private String auftraggeber;
	private String auftraggeber_kontoNrOrIBAN;
	private String bezeichnung;
	private String valutadatum;
	private String betrag;
	private String waehrung;
	private String auftraggeber_BlzOrBic;
	private String partnername;
	private String partner_kontoNrOrIBAN;
	private String partner_BlzOrBic;
	private String kundendatenOrZahlungsreferenz;
	private String buchungsdatum;
	private String umsatzzeile1;
	private String umsatzzeile2;
	private String zusatztext;
	private String ersterfassungsreferenz;

	@Override
	public String toString() {
		return "[" + ersterfassungsreferenz + "] " + auftraggeber + " ("
				+ auftraggeber_kontoNrOrIBAN + ") " + bezeichnung + " "
				+ waehrung + " " + betrag;
	}

	public String getAuftraggeber() {
		return auftraggeber;
	}

	public void setAuftraggeber(String auftraggeber) {
		this.auftraggeber = auftraggeber;
	}

	public String getAuftraggeber_kontoNrOrIBAN() {
		return auftraggeber_kontoNrOrIBAN;
	}

	public void setAuftraggeber_kontoNrOrIBAN(String auftraggeber_kontoNrOrIBAN) {
		this.auftraggeber_kontoNrOrIBAN = auftraggeber_kontoNrOrIBAN;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getValutadatum() {
		return valutadatum;
	}

	public void setValutadatum(String valutadatum) {
		this.valutadatum = valutadatum;
	}

	public String getBetrag() {
		return betrag;
	}

	public void setBetrag(String betrag) {
		this.betrag = betrag;
	}

	public String getWaehrung() {
		return waehrung;
	}

	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}

	public String getAuftraggeber_BlzOrBic() {
		return auftraggeber_BlzOrBic;
	}

	public void setAuftraggeber_BlzOrBic(String auftraggeber_BlzOrBic) {
		this.auftraggeber_BlzOrBic = auftraggeber_BlzOrBic;
	}

	public String getPartnername() {
		return partnername;
	}

	public void setPartnername(String partnername) {
		this.partnername = partnername;
	}

	public String getPartner_kontoNrOrIBAN() {
		return partner_kontoNrOrIBAN;
	}

	public void setPartner_kontoNrOrIBAN(String partner_kontoNrOrIBAN) {
		this.partner_kontoNrOrIBAN = partner_kontoNrOrIBAN;
	}

	public String getPartner_BlzOrBic() {
		return partner_BlzOrBic;
	}

	public void setPartner_BlzOrBic(String partner_BlzOrBic) {
		this.partner_BlzOrBic = partner_BlzOrBic;
	}

	public String getKundendatenOrZahlungsreferenz() {
		return kundendatenOrZahlungsreferenz;
	}

	public void setKundendatenOrZahlungsreferenz(
			String kundendatenOrZahlungsreferenz) {
		this.kundendatenOrZahlungsreferenz = kundendatenOrZahlungsreferenz;
	}

	public String getBuchungsdatum() {
		return buchungsdatum;
	}

	public void setBuchungsdatum(String buchungsdatum) {
		this.buchungsdatum = buchungsdatum;
	}

	public String getUmsatzzeile1() {
		return umsatzzeile1;
	}

	public void setUmsatzzeile1(String umsatzzeile1) {
		this.umsatzzeile1 = umsatzzeile1;
	}

	public String getUmsatzzeile2() {
		return umsatzzeile2;
	}

	public void setUmsatzzeile2(String umsatzzeile2) {
		this.umsatzzeile2 = umsatzzeile2;
	}

	public String getZusatztext() {
		return zusatztext;
	}

	public void setZusatztext(String zusatztext) {
		this.zusatztext = zusatztext;
	}

	public String getErsterfassungsreferenz() {
		return ersterfassungsreferenz;
	}

	public void setErsterfassungsreferenz(String ersterfassungsreferenz) {
		this.ersterfassungsreferenz = ersterfassungsreferenz;
	}
}
