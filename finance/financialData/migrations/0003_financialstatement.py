# Generated by Django 3.2.13 on 2023-09-21 04:04

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('financialData', '0002_delete_financialstatement'),
    ]

    operations = [
        migrations.CreateModel(
            name='FinancialStatement',
            fields=[
                ('seq', models.AutoField(primary_key=True, serialize=False)),
                ('current_assets', models.BigIntegerField(default=0)),
                ('non_current_assets', models.BigIntegerField(default=0)),
                ('total_assets_first', models.BigIntegerField(default=0)),
                ('total_assets_second', models.BigIntegerField(default=0)),
                ('current_liabilities', models.BigIntegerField(default=0)),
                ('non_current_liabilities', models.BigIntegerField(default=0)),
                ('total_liabilities_first', models.BigIntegerField(default=0)),
                ('total_liabilities_second', models.BigIntegerField(default=0)),
                ('capital', models.BigIntegerField(default=0)),
                ('total_equity', models.BigIntegerField(default=0)),
                ('revenue_first', models.BigIntegerField(default=0)),
                ('revenue_second', models.BigIntegerField(default=0)),
                ('revenue_2020', models.BigIntegerField(default=0)),
                ('revenue_2021', models.BigIntegerField(default=0)),
                ('gross_profit', models.BigIntegerField(default=0)),
                ('operating_profit_first', models.BigIntegerField(default=0)),
                ('operating_profit_second', models.BigIntegerField(default=0)),
                ('non_operating_income', models.BigIntegerField(default=0)),
                ('non_operating_expenses', models.BigIntegerField(default=0)),
                ('income_before_tax', models.BigIntegerField(default=0)),
                ('income_tax_expense', models.BigIntegerField(default=0)),
                ('net_income', models.BigIntegerField(default=0)),
                ('net_income_2020', models.BigIntegerField(default=0)),
                ('net_income_2021', models.BigIntegerField(default=0)),
                ('total_asset_growth_rate', models.FloatField(default=0.0)),
                ('revenue_asset_growth_rate', models.FloatField(default=0.0)),
                ('net_income_growth_rate', models.FloatField(default=0.0)),
                ('operating_profit_margin', models.FloatField(default=0.0)),
                ('roe', models.FloatField(default=0.0)),
                ('roic', models.FloatField(default=0.0)),
                ('debt_to_equity_ratio', models.FloatField(default=0.0)),
                ('interest_coverage_ratio', models.FloatField(default=0.0)),
                ('debt_dependency', models.FloatField(default=0.0)),
                ('accounts_receivable_turnover', models.FloatField(default=0.0)),
                ('inventory_turnover', models.FloatField(default=0.0)),
                ('total_asset_turnover', models.FloatField(default=0.0)),
                ('company_seq', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='financial_statements', to='financialData.company')),
            ],
        ),
    ]
