# -*- coding: utf-8 -*-
# Generated by Django 1.9.9 on 2016-09-09 16:09
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('rating', '0002_auto_20160909_1033'),
    ]

    operations = [
        migrations.CreateModel(
            name='File',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('file', models.FileField(upload_to='links/%Y/%m/%d')),
            ],
        ),
    ]