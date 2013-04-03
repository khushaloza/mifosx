/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savings.data;

import java.math.BigDecimal;
import java.util.Collection;

import org.joda.time.LocalDate;
import org.mifosplatform.infrastructure.core.data.EnumOptionData;
import org.mifosplatform.organisation.monetary.data.CurrencyData;

/**
 * Immutable data object representing a savings account.
 */
@SuppressWarnings("unused")
public class SavingsAccountData {

    private final Long id;
    private final String accountNo;
    private final String externalId;
    private final SavingsAccountStatusEnumData status;
    private final LocalDate activationDate;
    private final Long groupId;
    private final String groupName;
    private final Long clientId;
    private final String clientName;
    private final Long savingsProductId;
    private final String savingsProductName;
    private final CurrencyData currency;
    private final BigDecimal nominalAnnualInterestRate;
    private final EnumOptionData interestCompoundingPeriodType;
    private final EnumOptionData interestCalculationType;
    private final EnumOptionData interestCalculationDaysInYearType;
    private final BigDecimal minRequiredOpeningBalance;
    private final Integer lockinPeriodFrequency;
    private final EnumOptionData lockinPeriodFrequencyType;

    // associations
    private final SavingsAccountSummaryData summary;
    private final Collection<SavingsAccountTransactionData> transactions;

    // template
    private final Collection<SavingsProductData> productOptions;
    private final Collection<EnumOptionData> interestCompoundingPeriodTypeOptions;
    private final Collection<EnumOptionData> interestCalculationTypeOptions;
    private final Collection<EnumOptionData> interestCalculationDaysInYearTypeOptions;
    private final Collection<EnumOptionData> lockinPeriodFrequencyTypeOptions;

    public static SavingsAccountData instance(final Long id, final String accountNo, final String externalId,
            final SavingsAccountStatusEnumData status, final LocalDate activationDate, final Long groupId, final String groupName,
            final Long clientId, final String clientName, final Long productId, final String productName, final CurrencyData currency,
            final BigDecimal interestRate, final EnumOptionData interestCompoundingPeriodType,
            final EnumOptionData interestCalculationType, final EnumOptionData interestCalculationDaysInYearType,
            final BigDecimal minRequiredOpeningBalance, final Integer lockinPeriodFrequency,
            final EnumOptionData lockinPeriodFrequencyType, final SavingsAccountSummaryData summary) {

        final Collection<SavingsProductData> productOptions = null;
        final Collection<EnumOptionData> interestCompoundingPeriodTypeOptions = null;
        final Collection<EnumOptionData> interestCalculationTypeOptions = null;
        final Collection<EnumOptionData> interestCalculationDaysInYearTypeOptions = null;
        final Collection<EnumOptionData> lockinPeriodFrequencyTypeOptions = null;
        final Collection<SavingsAccountTransactionData> transactions = null;

        return new SavingsAccountData(id, accountNo, externalId, status, activationDate, groupId, groupName, clientId, clientName,
                productId, productName, currency, interestRate, interestCompoundingPeriodType, interestCalculationType,
                interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, summary,
                productOptions, interestCompoundingPeriodTypeOptions, interestCalculationTypeOptions,
                interestCalculationDaysInYearTypeOptions, lockinPeriodFrequencyTypeOptions, transactions);
    }

    public static SavingsAccountData withTemplateOptions(final SavingsAccountData account,
            final Collection<SavingsProductData> productOptions, final Collection<EnumOptionData> interestCompoundingPeriodTypeOptions,
            final Collection<EnumOptionData> interestCalculationTypeOptions,
            final Collection<EnumOptionData> interestCalculationDaysInYearTypeOptions,
            final Collection<EnumOptionData> lockinPeriodFrequencyTypeOptions, final Collection<SavingsAccountTransactionData> transactions) {

        return new SavingsAccountData(account.id, account.accountNo, account.externalId, account.status, account.activationDate,
                account.groupId, account.groupName, account.clientId, account.clientName, account.savingsProductId,
                account.savingsProductName, account.currency, account.nominalAnnualInterestRate, account.interestCompoundingPeriodType,
                account.interestCalculationType, account.interestCalculationDaysInYearType, account.minRequiredOpeningBalance,
                account.lockinPeriodFrequency, account.lockinPeriodFrequencyType, account.summary, productOptions,
                interestCompoundingPeriodTypeOptions, interestCalculationTypeOptions, interestCalculationDaysInYearTypeOptions,
                lockinPeriodFrequencyTypeOptions, transactions);
    }

    public static SavingsAccountData withClientTemplate(final Long clientId, final String clientName, final Long groupId,
            final String groupName) {

        final Long id = null;
        final String accountNo = null;
        final String externalId = null;
        final SavingsAccountStatusEnumData status = null;
        final LocalDate activationDate = null;
        final Long productId = null;
        final String productName = null;
        final CurrencyData currency = null;
        final BigDecimal nominalAnnualInterestRate = null;
        final EnumOptionData interestPeriodType = null;
        final EnumOptionData interestCalculationType = null;
        final EnumOptionData interestCalculationDaysInYearType = null;
        final BigDecimal minRequiredOpeningBalance = null;
        final Integer lockinPeriodFrequency = null;
        final EnumOptionData lockinPeriodFrequencyType = null;
        final SavingsAccountSummaryData summary = null;
        final Collection<SavingsProductData> productOptions = null;
        final Collection<CurrencyData> currencyOptions = null;
        final Collection<EnumOptionData> interestCompoundingPeriodTypeOptions = null;
        final Collection<EnumOptionData> interestCalculationTypeOptions = null;
        final Collection<EnumOptionData> interestCalculationDaysInYearTypeOptions = null;
        final Collection<EnumOptionData> lockinPeriodFrequencyTypeOptions = null;
        final Collection<SavingsAccountTransactionData> transactions = null;

        return new SavingsAccountData(id, accountNo, externalId, status, activationDate, groupId, groupName, clientId, clientName,
                productId, productName, currency, nominalAnnualInterestRate, interestPeriodType, interestCalculationType,
                interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, summary,
                productOptions, interestCompoundingPeriodTypeOptions, interestCalculationTypeOptions,
                interestCalculationDaysInYearTypeOptions, lockinPeriodFrequencyTypeOptions, transactions);
    }

    private SavingsAccountData(final Long id, final String accountNo, final String externalId, final SavingsAccountStatusEnumData status,
            final LocalDate activationDate, final Long groupId, final String groupName, final Long clientId, final String clientName,
            final Long productId, final String productName, final CurrencyData currency, final BigDecimal nominalAnnualInterestRate,
            final EnumOptionData interestPeriodType, final EnumOptionData interestCalculationType,
            final EnumOptionData interestCalculationDaysInYearType, final BigDecimal minRequiredOpeningBalance,
            final Integer lockinPeriodFrequency, final EnumOptionData lockinPeriodFrequencyType, final SavingsAccountSummaryData summary,
            final Collection<SavingsProductData> productOptions, final Collection<EnumOptionData> interestCompoundingPeriodTypeOptions,
            final Collection<EnumOptionData> interestCalculationTypeOptions,
            final Collection<EnumOptionData> interestCalculationDaysInYearTypeOptions,
            final Collection<EnumOptionData> lockinPeriodFrequencyTypeOptions, final Collection<SavingsAccountTransactionData> transactions) {
        this.id = id;
        this.accountNo = accountNo;
        this.externalId = externalId;
        this.status = status;
        this.activationDate = activationDate;
        this.groupId = groupId;
        this.groupName = groupName;
        this.clientId = clientId;
        this.clientName = clientName;
        this.savingsProductId = productId;
        this.savingsProductName = productName;
        this.currency = currency;
        this.nominalAnnualInterestRate = nominalAnnualInterestRate;
        this.interestCompoundingPeriodType = interestPeriodType;
        this.interestCalculationType = interestCalculationType;
        this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
        this.minRequiredOpeningBalance = minRequiredOpeningBalance;
        this.lockinPeriodFrequency = lockinPeriodFrequency;
        this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
        this.summary = summary;

        this.productOptions = productOptions;
        this.interestCompoundingPeriodTypeOptions = interestCompoundingPeriodTypeOptions;
        this.interestCalculationTypeOptions = interestCalculationTypeOptions;
        this.interestCalculationDaysInYearTypeOptions = interestCalculationDaysInYearTypeOptions;
        this.lockinPeriodFrequencyTypeOptions = lockinPeriodFrequencyTypeOptions;
        this.transactions = transactions;
    }
}