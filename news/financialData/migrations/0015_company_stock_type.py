# Generated by Django 3.2.13 on 2023-09-27 05:09

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('financialData', '0014_financialproduct_rsrv_type_nm'),
    ]

    operations = [
        migrations.AddField(
            model_name='company',
            name='stock_type',
            field=models.IntegerField(default=0, null=True),
        ),
    ]