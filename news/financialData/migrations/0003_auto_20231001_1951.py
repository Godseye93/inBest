# Generated by Django 3.2.13 on 2023-10-01 10:51

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('financialData', '0002_auto_20231001_1927'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='companyindicatorsscore',
            name='company_seq',
        ),
        migrations.DeleteModel(
            name='CompanyIndicators',
        ),
        migrations.DeleteModel(
            name='CompanyIndicatorsScore',
        ),
    ]
