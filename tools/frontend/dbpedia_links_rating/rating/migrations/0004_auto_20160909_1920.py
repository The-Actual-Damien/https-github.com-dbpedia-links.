# -*- coding: utf-8 -*-
# Generated by Django 1.9.9 on 2016-09-09 19:20
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('rating', '0003_file'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='linkrating',
            name='link',
        ),
        migrations.AddField(
            model_name='link',
            name='rating',
            field=models.IntegerField(default=0),
        ),
        migrations.DeleteModel(
            name='LinkRating',
        ),
    ]