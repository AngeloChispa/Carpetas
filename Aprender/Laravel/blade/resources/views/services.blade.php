@extends('layouts.landing')

@section('title', 'Services')

@section('body')
    <h1>Services</h1>
    @component('_components.card')
        @slot('title', 'Service 1')
        @slot('text', 'Lorem ipsum dolor set');
    @endcomponent
@endsection