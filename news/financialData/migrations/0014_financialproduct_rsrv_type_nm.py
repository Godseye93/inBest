# Generated by Django 3.2.13 on 2023-09-26 07:28

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('financialData', '0013_alter_financialproduct_fin_prdt_cd'),
    ]

    operations = [
        migrations.AddField(
            model_name='financialproduct',
            name='rsrv_type_nm',
            field=models.CharField(default=None, max_length=255, null=True),
        ),
    ]